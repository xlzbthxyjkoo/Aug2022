package mvcTest.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import mvcTest.model.Member;

public interface MemberRepository extends JpaRepository<Member, String> {
	Optional<Member> findByUserId(String userId);
}
