package egovframework.example.controller.ex01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BasicController {
//	1.1 따라하기 예제
	@GetMapping("/ex01/example01.do")
	public String example01() {
		return "ex01/example01";
	}
	
//	1.2 변경하기 퀴즈
	@GetMapping("/ex01/quiz01.do")
	public String quiz01() {
		return "ex01/quiz01";
	}
	
}
