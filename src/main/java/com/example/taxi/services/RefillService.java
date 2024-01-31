package com.example.taxi.services;

import org.springframework.stereotype.Service;

import com.example.taxi.entities.Refill;
import com.example.taxi.repositories.RefillRepository;

@Service
public class RefillService {
	private final RefillRepository repository;

	public RefillService(RefillRepository repository) {
		this.repository = repository;
	}

	public Iterable<Refill> getAll() {
		return repository.findAll();
	}

	public Refill add(Refill obj) {
		return repository.save(obj);
	}
}
