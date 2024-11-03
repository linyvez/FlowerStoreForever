package com.example.demo.flowerStore.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.flowerStore.model.Flower;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface FlowerRepository extends JpaRepository<Flower, Long> {
}
