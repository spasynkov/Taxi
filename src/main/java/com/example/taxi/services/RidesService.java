package com.example.taxi.services;

import org.springframework.stereotype.Service;

import com.example.taxi.entities.Distance;
import com.example.taxi.repositories.DistanceRepository;

@Service
public class DistanceService {
	private final DistanceRepository repository;

	public DistanceService(DistanceRepository repository) {
		this.repository = repository;
	}

	public Iterable<Distance> getAll() {
		return repository.findAll();
	}

	public Distance add(Distance obj) {
		return repository.save(obj);
	}
}
