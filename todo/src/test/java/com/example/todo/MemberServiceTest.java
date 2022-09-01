package com.example.todo;

import com.example.todo.dto.Member;
import com.example.todo.entity.MemberEntity;
import com.example.todo.service.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.util.List;

@SpringBootTest
@Transactional
public class MemberServiceTest {
    @Autowired
    MemberService memberService;
    @Test
    public void update()throws  Exception{
        Member member1 = new Member("boot1","강경미","1234","carami@gmail.com");
        Member member = memberService.addMember(member1);
        member.setName("test12122");
        member.setPassword("test1223");

        memberService.updateMember(member);

        System.out.println(memberService.getMember(member.getUserId()));


    }
    @Test
    public void getAll() throws Exception{
        Member member1 = new Member("boot1","강경미","1234","carami@gmail.com");
        Member member2 = new Member("2","강경미2","123422","carami2@gmail.com");
        Member member3 = new Member("test","test","testp2","test@test.com");

        memberService.addMember(member1);
        memberService.addMember(member2);
        memberService.addMember(member3);

        List<Member> all = memberService.getMembers();

        for (Member member:all){
            System.out.println(member);
        }

    }
}
