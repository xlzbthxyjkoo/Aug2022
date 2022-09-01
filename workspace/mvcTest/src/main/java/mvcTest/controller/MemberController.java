package mvcTest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import mvcTest.model.Member;
import mvcTest.service.MemberService;

@Controller
@RequestMapping("/member")
public class MemberController {
	@Autowired
	private MemberService memberService;
	@RequestMapping("/list")
	public String list(Model model) {
		model.addAttribute("members",memberService.getMembers());
		return "/member/list";
	}
	@PostMapping("/add")
	public String add(@ModelAttribute Member member) {
		memberService.addMember(member);
		return "redirect:/member/list";
	}
	@GetMapping("/add")
	public String form() {
		return "member/memberForm";
	}
}
