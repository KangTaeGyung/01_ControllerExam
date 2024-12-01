package egovframework.example.controller.ex03;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MultiParamController {
//	따라하기 예제 3.1
	@GetMapping("/ex03/example01.do")
	public String example01(Model model, @RequestParam(defaultValue = "") String name,
			@RequestParam(defaultValue = "") String id) {
		model.addAttribute("name", name);
		model.addAttribute("id", id);
		return "ex03/example01";
	}

//	퀴즈 3.2
	@GetMapping("/ex03/quiz01.do")
	public String quiz01(Model model, @RequestParam(defaultValue = "0") int dno,
			@RequestParam(defaultValue = "") String dname, @RequestParam(defaultValue = "") String loc) {
		model.addAttribute("dno", dno);
		model.addAttribute("dname", dname);
		model.addAttribute("loc", loc);
		return "ex03/quiz01";
	}

//	따라하기 예제 3.3
	@GetMapping("/ex03/example02.do")
	public String example02(Model model, @RequestParam(defaultValue = "") String fno,
			@RequestParam(defaultValue = "") String title, @RequestParam(defaultValue = "") String content) {
		List<String> list = new ArrayList<String>();
		list.add(fno);
		list.add(title);
		list.add(content);

		model.addAttribute("list", list);

		return "ex03/example02";
	}

//	퀴즈 3.4
	@GetMapping("ex03/quiz02.do")
	public String quiz02(Model model, @RequestParam(defaultValue = "") String eno,
			@RequestParam(defaultValue = "") String ename, @RequestParam(defaultValue = "") String job,
			@RequestParam(defaultValue = "") String hiredate) {
		List<String> list = new ArrayList<>();
		list.add(eno);
		list.add(ename);
		list.add(job);
		list.add(hiredate);

		model.addAttribute("list", list);

		return "ex03/quiz02";
	}

//	따라하기 예제 3.5
	@GetMapping("/ex03/example03.do")
	public String example03(Model model, @RequestParam(defaultValue = "") String fno,
			@RequestParam(defaultValue = "") String title, @RequestParam(defaultValue = "") String content) {
		List<String> list = new ArrayList<String>();
		list.add(fno);
		list.add(title);
		list.add(content);

		model.addAttribute("list", list);

		return "ex03/example03";
	}

//	퀴즈 3.6
	@GetMapping("ex03/quiz03.do")
	public String quiz03(Model model, @RequestParam(defaultValue = "") String eno,
			@RequestParam(defaultValue = "") String ename, @RequestParam(defaultValue = "") String job,
			@RequestParam(defaultValue = "") String hiredate) {
		List<String> list = new ArrayList<>();
		list.add(eno);
		list.add(ename);
		list.add(job);
		list.add(hiredate);

		model.addAttribute("list", list);

		return "ex03/quiz03";
	}

//	따라하기 예제 3.7
	@GetMapping("/ex03/example04.do")
	public String example04(Model model, 
			@RequestParam(defaultValue = "") String name,
			@RequestParam(defaultValue = "") String color) {
		model.addAttribute("name", name);
		model.addAttribute("color", color);

		return "ex03/example04";
	}
}
