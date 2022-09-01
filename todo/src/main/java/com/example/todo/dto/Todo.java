package com.example.todo.dto;

import lombok.*;

import java.time.LocalDateTime;
@Setter
@Getter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
public class Todo {
    private Long id;
    private String todo;
    private LocalDateTime createDate;
    private LocalDateTime endDate;
    private Member member;

    public Todo(String todo){
        this.todo = todo;
    }
}
