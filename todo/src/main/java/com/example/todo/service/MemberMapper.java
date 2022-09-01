package com.example.todo.service;

import com.example.todo.dto.Member;
import com.example.todo.entity.MemberEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MemberMapper {
    public Member fromMemberEntity(MemberEntity memberEntity){
        if(memberEntity != null) {
            Member member = new Member(memberEntity.getUserId(), memberEntity.getName(), memberEntity.getPassword(), memberEntity.getEmail());
            member.setId(memberEntity.getId());
            member.setJoinDate(memberEntity.getJoinDate());
            return member;
        }else{
            return null;
        }
    }

    public MemberEntity fromMember(Member member){
        if(member != null) {
            MemberEntity memberEntity = new MemberEntity(member.getUserId(), member.getName(), member.getPassword(), member.getEmail());
            memberEntity.setId(member.getId());
            memberEntity.setJoinDate(member.getJoinDate());
            return memberEntity;
        }else{
            return null;
        }
    }

    public List<Member> fromMemberEntityList(List<MemberEntity> memberEntityList){
        List<Member> list = new ArrayList<>();
        for(MemberEntity memberEntity:memberEntityList){
            list.add(fromMemberEntity(memberEntity));
        }
        return list;
    }

    public void toMemberEntityFromMember(MemberEntity memberEntity, Member member){
        BeanUtils.copyProperties(member, memberEntity);
    }
}
