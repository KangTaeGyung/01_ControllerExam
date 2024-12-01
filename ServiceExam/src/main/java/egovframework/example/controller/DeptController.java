package egovframework.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import egovframework.example.service.DeptService;
import egovframework.example.vo.DeptVO;
import lombok.extern.log4j.Log4j;

@Log4j
@Controller
public class DeptController {

	@Autowired
	DeptService deptService; // 서비스 객체

//	전체 조회 
	@GetMapping("/dept.do")
	public String selectAll(Model model) {
		List<DeptVO> list = deptService.selectAll();
		model.addAttribute("list", list);

		return "dept/dept_all";
	}

//	부서 추가 페이지 열기 
	@GetMapping("/dept/addition.do")
	public String addDeptView() {
		return "dept/add_dept";
	}

	@PostMapping("/dept/add.do")
	public String insert(@ModelAttribute DeptVO deptVO) {
		
		deptService.insert(deptVO);
		return "redirect:/dept.do";
	}

//	부서 수정 페이지 열기 (상세 조회)
	@GetMapping("/dept/edition.do")
	public String updateDeptView(Model model,
					@RequestParam(defaultValue = "0") long dno
								) {
		DeptVO deptVO = deptService.selectDept(dno);
		model.addAttribute("deptVO", deptVO);

		return "dept/update_dept";
	}

	@PostMapping("/dept/edit.do")
	public String update(@RequestParam(defaultValue = "0") long dno, 
			                 @ModelAttribute DeptVO deptVO) {
		deptService.update(deptVO);
		return "redirect:/dept.do";
	}
	
	@PostMapping("/dept/delete.do")
	public String delete(@RequestParam(defaultValue = "0") long dno) {
		deptService.delete(dno);
		return "redirect:/dept.do";
	}
}












