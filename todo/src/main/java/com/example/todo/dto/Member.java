package com.example.todo.dto;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Column;
import java.time.LocalDateTime;
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
public class Member {
    private Long id;
    private String userId;
    private String name;
    private String password;
    private String email;
    private LocalDateTime joinDate;

    public Member(String userId,String name,String password, String email){
        this.userId = userId;
        this.name = name;
        this.password = password;
        this.email = email;
    }
}
