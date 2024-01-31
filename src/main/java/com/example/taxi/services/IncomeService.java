package com.example.taxi.services;

import org.springframework.stereotype.Service;

import com.example.taxi.entities.Income;
import com.example.taxi.repositories.IncomeRepository;

@Service
public class IncomeService {
	private final IncomeRepository repository;

	public IncomeService(IncomeRepository repository) {
		this.repository = repository;
	}

	public Iterable<Income> getAll() {
		return repository.findAll();
	}

	public Income add(Income obj) {
		return repository.save(obj);
	}
}
