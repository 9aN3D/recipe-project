package com.example.guru.recipeproject.repositories;

import com.example.guru.recipeproject.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRespository extends CrudRepository<Category, Long> {
}
