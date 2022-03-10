package com.jocelinlaroch08.springtodo.controllers;

import com.jocelinlaroch08.springtodo.controllers.api.CategoryApi;
import com.jocelinlaroch08.springtodo.dto.CategoryDto;
import com.jocelinlaroch08.springtodo.dto.TodoDto;
import com.jocelinlaroch08.springtodo.services.CategoryService;
import com.jocelinlaroch08.springtodo.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class CategoryController implements CategoryApi {

    @Autowired
    private TodoService todoService;

    @Autowired
    private CategoryService categoryService;

    @Override
    public ResponseEntity<CategoryDto> createCategory(CategoryDto categoryDto) {
        return new ResponseEntity<>(categoryService.save(categoryDto), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<CategoryDto> updateCategory(CategoryDto categoryDto) {
        return new ResponseEntity<>(categoryService.save(categoryDto), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<List<CategoryDto>> getAllCategories() {
        return new ResponseEntity<>(categoryService.findAll(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<TodoDto>> getAllTodoByCategoryId(Long id) {
        return new ResponseEntity<>(todoService.findByCategory(id), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<TodoDto>> getAllTodoByCategoryForToday(Long categoryId) {
        return new ResponseEntity(categoryService.getAllTodoByCategoryForToday(categoryId), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<CategoryDto>> getAllCategoryByUserId(Long id) {
        return new ResponseEntity<>(categoryService.findAllByUserId(id), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<CategoryDto> getCategory(Long id) {
        return new ResponseEntity<>(categoryService.findById(id), HttpStatus.OK);
    }

    @Override
    public ResponseEntity deleteCategory(Long id) {
        return new ResponseEntity(HttpStatus.OK);
    }
}
