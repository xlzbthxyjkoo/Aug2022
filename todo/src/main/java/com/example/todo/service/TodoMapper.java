package com.example.todo.service;

import com.example.todo.dto.Todo;
import com.example.todo.entity.TodoEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class TodoMapper {

    private final MemberMapper memberMapper;

    public Todo fromTodoEntity(TodoEntity todoEntity){
        Todo todo = new Todo(todoEntity.getTodo());
        todo.setId(todoEntity.getId());
        todo.setCreateDate(todoEntity.getCreateDate());
        todo.setEndDate(todoEntity.getEndDate());
        todo.setMember(memberMapper.fromMemberEntity(todoEntity.getMember()));
        return todo;
    }

    public TodoEntity fromTodo(Todo todo){
        TodoEntity todoEntity = new TodoEntity(todo.getTodo());
        todoEntity.setId(todo.getId());
        todoEntity.setCreateDate(todo.getCreateDate());
        todoEntity.setEndDate(todo.getEndDate());
        todoEntity.setMember(memberMapper.fromMember(todo.getMember()));


        return todoEntity;
    }
    public List<Todo> fromTodoEntityList(List<TodoEntity> todoEntityList){
        List<Todo> list = new ArrayList<>();
        for(TodoEntity todoEntity:todoEntityList){
            list.add(fromTodoEntity(todoEntity));
        }
        return list;
    }

}