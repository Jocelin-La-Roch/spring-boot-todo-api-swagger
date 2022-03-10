package com.jocelinlaroch08.springtodo.repositories;

import com.jocelinlaroch08.springtodo.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TodoRepository extends JpaRepository<Todo, Long> {

    List<Todo> findTodoByCategoryId(Long categoryId);
}
