package com.example.taxi.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.taxi.entities.Refill;

@Repository
public interface RefillRepository extends CrudRepository<Refill, Long> {
}
