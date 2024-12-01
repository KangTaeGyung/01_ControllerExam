package egovframework.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import egovframework.example.service.MemberService;
import egovframework.example.vo.MemberVO;

@Controller
public class MemberController {
	
	@Autowired
	MemberService memberService;
	
	@GetMapping("/member.do")
	public String selectAll(Model model) {
		
		List<MemberVO> list = memberService.selectAll(); // 전제조회 
		model.addAttribute("list", list);
		return "member/member_all";
	}
	
//	멤버 추가 페이지 열기 
	@GetMapping("/member/addition.do")
	public String addMemberView() {
		return "member/add_member";
	}
	
	@PostMapping("/member/add.do")
	public String insert(@ModelAttribute MemberVO memberVO) {
		memberService.insert(memberVO);
		return "redirect:/member.do";
	}
	
//	상세조회페이지(수정페이지) 열기
	@GetMapping("/member/edition.do")
	public String updateMemberView(@RequestParam(defaultValue = "0") long eno,
									Model model
			) {
		MemberVO memberVO = memberService.selectMember(eno);
		model.addAttribute("memberVO", memberVO);
		return "member/update_member";
	}
	
	@PostMapping("/member/edit.do")
	public String update(@RequestParam(defaultValue = "0") long eno, 
			                 @ModelAttribute MemberVO memberVO) {
		memberService.update(memberVO);
		return "redirect:/member.do";
	}
	
	@PostMapping("/member/delete.do")
	public String delete(@RequestParam(defaultValue = "0") long eno) {
		memberService.delete(eno);
		return "redirect:/member.do";
	}
}




