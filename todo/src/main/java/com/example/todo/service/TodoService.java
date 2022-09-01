package com.example.todo.service;

import com.example.todo.dto.Todo;
import com.example.todo.entity.MemberEntity;
import com.example.todo.entity.TodoEntity;
import com.example.todo.repository.MemberRepository;
import com.example.todo.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TodoService {
    private final TodoRepository todoRepository;
    private final MemberRepository memberRepository;
    private final TodoMapper todoMapper;

    public List<Todo> todos(){
        List<TodoEntity> all = todoRepository.findAll();
        return todoMapper.fromTodoEntityList(all);
    }
    public List<Todo> byMemberTodos(Long id){
        Optional<MemberEntity> byId = memberRepository.findById(id);
        List<TodoEntity> byMember = todoRepository.findByMember(byId.get());
        return todoMapper.fromTodoEntityList(byMember);
    }
    @Transactional
    public Todo addTdoo(Todo todo){
        return todoMapper.fromTodoEntity( todoRepository.save(todoMapper.fromTodo(todo)));
    }
    public void delTodo(Long id){
        todoRepository.delete(todoRepository.findById(id).get());
    }
    @Transactional
    public void updateTodo(Long id){
        TodoEntity todoEntity = todoRepository.findById(id).orElseThrow();
        if(todoEntity.getEndDate() != null){
            todoEntity.setEndDate(null);
        }else{
            todoEntity.setEndDate(LocalDateTime.now());
        }
    }
}
