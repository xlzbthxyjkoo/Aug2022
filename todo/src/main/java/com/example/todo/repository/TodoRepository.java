package com.example.todo.repository;

import com.example.todo.entity.MemberEntity;
import com.example.todo.entity.TodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface TodoRepository extends JpaRepository<TodoEntity, Long> {
    List<TodoEntity> findByMember(MemberEntity member);

}
