package com.example.demo.flowerStore.service;

import java.util.List;

import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.flowerStore.model.AppUser;
import com.example.demo.flowerStore.repository.AppUserRepository;

@Service
public class AppUserService {

    private final AppUserRepository appUserRepository;

    @Autowired
    public AppUserService(AppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;
    }
    
    public List<AppUser> list() {
        return appUserRepository.findAll();
    }

    public AppUser create(AppUser appUser) throws BadRequestException {
        if (appUserRepository.findUserByEmail(appUser.getEmail()).isEmpty()) {
            return appUserRepository.save(appUser);
        }
        else {
            throw new BadRequestException();
        }
    }

}
