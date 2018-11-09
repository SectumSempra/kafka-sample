package com.be.kafkasample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.be.kafkasample.model.Region;

@Repository
public interface RegionRepository extends JpaRepository<Region, Integer> {

}
