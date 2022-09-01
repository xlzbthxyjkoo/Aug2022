package com.example.todo.service;

import com.example.todo.dto.Member;
import com.example.todo.entity.MemberEntity;
import com.example.todo.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberMapper memberMapper;
    private final MemberRepository memberRepository;
    @Transactional
    public Member checkLogin(Member member){
        Optional<MemberEntity> memberEntity = memberRepository.signMember(member.getUserId(), member.getPassword());

//        MemberEntity memberEntity = memberRepository.signMember(member.getUserId(),member.getPassword()).orElse( null);
        if (memberEntity.isEmpty())
            return null;
        else
            return memberMapper.fromMemberEntity(memberEntity.get());

    }
    @Transactional
    public Member addMember(Member member){
        MemberEntity memberEntity = memberMapper.fromMember(member);
        memberEntity = memberRepository.save(memberEntity);
        return memberMapper.fromMemberEntity(memberEntity);
    }

    @Transactional
    public List<Member> getMembers(){
        List<MemberEntity> members = memberRepository.findAll();
        return memberMapper.fromMemberEntityList(members);
    }
    @Transactional
    public Member getMember(String userId){

        MemberEntity memberEntity = memberRepository.findByUserId(userId).orElseThrow();
        return memberMapper.fromMemberEntity(memberEntity);
    }
    @Transactional
    public Member updateMember(Member member){
        MemberEntity memberEntity = memberRepository.findById(member.getId()).orElseThrow(() -> new IllegalArgumentException(member.getId()+"에 알맞는 데이터가 없습니다."));
//        MemberEntity memberEntity = memberRepository.findByUserId(member.getUserId()).orElseThrow(() -> new IllegalArgumentException(member.getUserId()+"에 알맞는 데이터가 없습니다."));


        memberMapper.toMemberEntityFromMember(memberEntity,member);
        return memberMapper.fromMemberEntity(memberEntity);
    }
}
