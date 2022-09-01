package com.example.todo.repository;

import com.example.todo.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<MemberEntity,Long> {
    Optional<MemberEntity> findByUserId(String userId);
    Optional<MemberEntity> findByEmail(String email);

    @Query("select m from member m where userId = :userId and password = :password")
    Optional<MemberEntity> signMember(String userId, String password);


}
