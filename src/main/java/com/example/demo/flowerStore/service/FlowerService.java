package com.example.demo.flowerStore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.flowerStore.model.Flower;
import com.example.demo.flowerStore.model.FlowerColor;
import com.example.demo.flowerStore.model.FlowerType;
import com.example.demo.flowerStore.repository.FlowerRepository;

import java.util.List;

@Service
public class FlowerService {
    public final FlowerRepository flowerRepository;

    @Autowired
    public FlowerService(FlowerRepository flowerRepository) {
        this.flowerRepository = flowerRepository;
    }

    public List<Flower> getAllFlowers() {
        return List.of(new Flower(FlowerType.CHAMOMILE, FlowerColor.BLUE, 35, 10), 
                    new Flower(FlowerType.ROSE, FlowerColor.RED, 60, 40));
    }

    public Flower create(Flower flower) {
        return flowerRepository.save(flower);
    }
}