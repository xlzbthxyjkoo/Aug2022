package com.example.todo.entity;

import com.example.todo.dto.Member;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
@Entity(name="todo")
@Table(name = "todo")
@Setter
@Getter
@EqualsAndHashCode
@NoArgsConstructor
public class TodoEntity {
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false,length = 50)
    private String todo;
    @Column(name="create_date")
    @CreationTimestamp
    private LocalDateTime createDate;
    @Column(name="end_date")
    private LocalDateTime endDate;
    @ManyToOne
    @JoinColumn(name="member_id")
    private MemberEntity member;
    public TodoEntity(String todo){
        this.todo = todo;
    }
}
