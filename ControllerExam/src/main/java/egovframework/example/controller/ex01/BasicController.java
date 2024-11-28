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
		return "ex01/example02";
	}
	
//	변경하기 퀴즈: 1.2
	@GetMapping("/ex01/quiz02.do")
	public String quiz02(Model model) {
		model.addAttribute("page", "안녕 페이지");
		return "ex01/quiz02";
	}
	
//	따라하기 예제 3
	@GetMapping("/ex01/example03.do")
	public String example03(Model model) {
		model.addAttribute("greeting", "안녕 스프링");
		model.addAttribute("greeting2", "안녕 스프링2");
		return "ex01/example03";
	}
	
//	변경하기 퀴즈: 1.3
	@GetMapping("/ex01/quiz03.do")
	public String quiz03(Model model) {
		model.addAttribute("page", "안녕 페이지");
		model.addAttribute("page2", "안녕 페이지2");
		model.addAttribute("page3", "안녕 페이지3");
		return "ex01/quiz03";
	}
	
//	따라하기 예제 4
	@GetMapping("/ex01/example04.do")
	public String example04(Model model) {
		
		String str = "abc";
		int num = 10;
		boolean value = true;
		
		model.addAttribute("str", str);
		model.addAttribute("num", num);
		model.addAttribute("value", value);
		return "ex01/example04";
	}
	
//	변경하기 퀴즈 4
	@GetMapping("/ex01/quiz04.do")
	public String quiz04(Model model) {
		
		String str = "hello";
		long num = 10;
		double value = 10.5;
		
		model.addAttribute("str", str);
		model.addAttribute("num", num);
		model.addAttribute("value", value);
		return "ex01/example04";
	}
}




