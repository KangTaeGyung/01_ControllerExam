package egovframework.example.controller.ex02;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ParamController {
	
//	따라하기 예제 2.1
    @GetMapping("/ex02/example01.do")
    public String example01(Model model,
                            @RequestParam(defaultValue = "") String name) {
        model.addAttribute("greeting", name);
        return "ex02/example01";
    }
    
//	퀴즈 2.2
    @GetMapping("/ex02/quiz01.do")
    public String quiz01(Model model,
                             @RequestParam(defaultValue = "") String dname) {
        model.addAttribute("dname", dname);
        return "ex02/quiz01";
    }
    
//	퀴즈 2.3
    @GetMapping("/ex02/quiz02.do")
    public String quiz01(Model model,
                             @RequestParam(defaultValue = "0") int dno) {
        model.addAttribute("dno", dno);
        return "ex02/quiz02";
    }
}
