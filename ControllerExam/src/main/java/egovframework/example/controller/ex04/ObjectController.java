package egovframework.example.controller.ex04;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import egovframework.example.vo.DeptVO;
import egovframework.example.vo.MemberVO;

@Controller
public class ObjectController {
    @GetMapping("/ex04/example01.do")
    public String example01(
            @ModelAttribute MemberVO memberVO
    ) {
        return "ex04/example01";
    }
    
    @GetMapping("/ex04/quiz01.do")
    public String quiz01(
            @ModelAttribute DeptVO deptVO
    ) {
        return "ex04/quiz01";
    }
}