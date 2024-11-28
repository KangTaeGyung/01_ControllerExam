package egovframework.example.controller.ex01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BasicController {
//	따라하기 예제 1
	@GetMapping("/ex01/example01.do")
	public String example01() {
		return "ex01/example01";
	}
	
//	변경하기 퀴즈: 1.1
	@GetMapping("/ex01/quiz01.do")
	public String quiz01() {
		return "ex01/quiz01";
	}
	
//	따라하기 예제 2
	@GetMapping("/ex01/example02.do")
	public String example02(Model model) {
		model.addAttribute("greeting", "안녕 스프링");
		return "/ex01/example02";
	}
	
//	변경하기 퀴즈: 1.2
	@GetMapping("/ex01/quiz02.do")
	public String quiz02(Model model) {
		model.addAttribute("page", "안녕 페이지");
		return "/ex01/quiz02";
	}
}




