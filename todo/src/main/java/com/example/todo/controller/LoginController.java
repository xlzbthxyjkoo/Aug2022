package com.example.todo.controller;

import com.example.todo.dto.Member;
import com.example.todo.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@RequiredArgsConstructor
@SessionAttributes("loginUser")
public class LoginController {
    private final MemberService memberService;

    @GetMapping("/login")
    public String loginform(){
        return "loginForm";
    }
    @PostMapping("/login")
    public String login(Model model,@ModelAttribute Member member){

        Member member1 = memberService.checkLogin(member);
        if(member1 != null){
            model.addAttribute("loginUser",member1);
            System.out.println("1"+member1.getEmail());
            return "redirect:/member/list";
        }else{
            return "redirect:/member/list";
        }
//        return "redirect:/member/list";
    }
    @RequestMapping("/logout")
    public String logout(Model model,SessionStatus sessionStatus){
        sessionStatus.setComplete();
        return "redirect:/";
    }
    public boolean loginFlag(@ModelAttribute("loginUser") Member member){
        if(member != null)
            return true;
        else
            return false;
    }
}
