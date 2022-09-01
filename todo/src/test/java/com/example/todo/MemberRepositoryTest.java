package com.example.todo;

import com.example.todo.entity.MemberEntity;
import com.example.todo.repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@SpringBootTest
@Transactional
public class MemberRepositoryTest {
    @Autowired
    MemberRepository memberRepository;

    @Test
    public void checkLogin() throws Exception{
        MemberEntity carami = memberRepository.signMember("carami", "1234").orElse(null);
        if(carami != null){
            System.out.println("^^");
        }else{
            System.out.println("--");
        }
    }
    @Test
    public void findByEmail() throws Exception{
        MemberEntity member1 = new MemberEntity("boot1","강경미","1234","carami@gmail.com");
        memberRepository.save(member1);
        Optional<MemberEntity> carami = memberRepository.findByEmail("carami@gmail.com");
        System.out.println(carami.get().getName());
    }
    @Test
    public void findByUserId() throws Exception{
        MemberEntity member1 = new MemberEntity("boot1","강경미","1234","carami@gmail.com");
        memberRepository.save(member1);
        Optional<MemberEntity>carami = memberRepository.findByUserId("boot1");
        System.out.println(carami);
    }
    @Test
    public void updateMember() throws Exception{
        MemberEntity member1 = new MemberEntity("boot1","강경미","1234","carami@gmail.com");
        MemberEntity saveMember = memberRepository.save(member1);

        memberRepository.findById(saveMember.getId());

    }
    @Test
    public void getAll() throws Exception{
        MemberEntity member1 = new MemberEntity("boot1","강경미","1234","carami@gmail.com");
        MemberEntity member2 = new MemberEntity("2","강경미2","123422","carami2@gmail.com");
        MemberEntity member3 = new MemberEntity("test","test","testp2","test@test.com");
        memberRepository.save(member1);
        memberRepository.save(member2);
        memberRepository.save(member3);

        List<MemberEntity> all = memberRepository.findAll();
        for(MemberEntity member : all){

            System.out.println(member.getName());
        }
        MemberEntity memberEntity = memberRepository.findByUserId("carami").orElseThrow();
        System.out.println(memberEntity);

    }
}
