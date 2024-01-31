package com.example.taxi.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.taxi.entities.Distance;

@Repository
public interface DistanceRepository extends CrudRepository<Distance, Long> {
}
