package com.example.todo.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity(name="member")
@Table(name="member")
@Setter
@Getter
@EqualsAndHashCode
@NoArgsConstructor
public class MemberEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String userId;
    private String name;
    private String password;
    private String email;
    @Column(name="join_date")
    @CreationTimestamp
    private LocalDateTime joinDate;

    public MemberEntity(String userId,String name,String password, String email){
        this.userId = userId;
        this.name = name;
        this.password = password;
        this.email = email;
    }
}
