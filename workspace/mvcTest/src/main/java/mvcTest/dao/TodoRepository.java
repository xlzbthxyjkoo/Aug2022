package mvcTest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import mvcTest.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
