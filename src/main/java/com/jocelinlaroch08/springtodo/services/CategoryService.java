package com.jocelinlaroch08.springtodo.services;

import com.jocelinlaroch08.springtodo.dto.CategoryDto;

import java.util.List;

public interface CategoryService {
    CategoryDto save(CategoryDto categoryDto);
    List<CategoryDto> findAll();
    CategoryDto findById(Long id);
    List<CategoryDto> findAllByUserId(Long userId);
    List<CategoryDto> getAllTodoByCategoryForToday(Long userId);
    void delete(Long id);
}
