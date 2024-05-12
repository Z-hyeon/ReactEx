package com.conan.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.conan.demo.domain.Todo;

public interface TodoRepository extends JpaRepository<Todo, Integer>{
}