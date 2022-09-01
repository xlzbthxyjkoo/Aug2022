package com.example.demo;

import com.example.demo.dao.MemberRepository;
import com.example.demo.entity.MemberEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.util.List;

@SpringBootTest
@Transactional
public class MemberRepositoryTest {
    @Autowired
    MemberRepository memberRepository;
    @Test
    public void getMember()throws Exception{

    }
    @Test
    public void getMembers() throws Exception{
        MemberEntity memberEntity1 = new MemberEntity("carami","kang","1234","carami@gmail.com");

        memberRepository.save(memberEntity1);


        List<MemberEntity> all = memberRepository.findAll();
        for(MemberEntity memberEntity:all){
            System.out.println(memberEntity);
        }

    }
}
