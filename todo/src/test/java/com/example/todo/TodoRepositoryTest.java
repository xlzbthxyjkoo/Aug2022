package com.example.todo;

import com.example.todo.dto.Todo;
import com.example.todo.entity.MemberEntity;
import com.example.todo.entity.TodoEntity;
import com.example.todo.repository.MemberRepository;
import com.example.todo.repository.TodoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@SpringBootTest
@Transactional
public class TodoRepositoryTest {
    @Autowired
    private TodoRepository todoRepository;
    @Autowired
    private MemberRepository memberRepository;
    @Test
    public void save() throws  Exception{

        TodoEntity todo = new TodoEntity();
        todo.setTodo("make todoList");

        TodoEntity todoEntity = todoRepository.save(todo);
        System.out.println(todoEntity);
    }
    @Test
    public void findByMember() throws Exception{
        Optional<MemberEntity> carami = memberRepository.findByUserId("carami");
        List<TodoEntity> byMember = todoRepository.findByMember(carami.get());

        System.out.println(byMember.size());


    }
}
