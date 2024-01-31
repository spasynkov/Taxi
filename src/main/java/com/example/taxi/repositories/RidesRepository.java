package com.example.taxi.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.taxi.entities.Ride;

@Repository
public interface RidesRepository extends CrudRepository<Ride, Long> {
}
