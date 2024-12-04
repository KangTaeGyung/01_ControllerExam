package egovframework.example.controller.basic;

import java.util.List;

import javax.annotation.Resource;

import org.egovframe.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springmodules.validation.commons.DefaultBeanValidator;

import egovframework.example.service.basic.EmpService;
import egovframework.example.vo.basic.DeptVO;
import egovframework.example.vo.basic.EmpVO;
import egovframework.example.vo.common.Criteria;

@Controller
public class EmpController {
	
	@Autowired
	private EmpService empService; 
	
	/** 유효성 체크 객체 */
	@Resource(name = "beanValidator")
	protected DefaultBeanValidator beanValidator;
	
	@GetMapping("/basic/emp.do")
	public String selectEmpList(@ModelAttribute("searchVO") Criteria searchVO,
			Model model
			) throws Exception {
		searchVO.setPageUnit(3); 
		searchVO.setPageSize(2); 
		
		PaginationInfo paginationInfo = new PaginationInfo();         
		paginationInfo.setCurrentPageNo(searchVO.getPageIndex());     
		paginationInfo.setRecordCountPerPage(searchVO.getPageUnit()); 
		paginationInfo.setPageSize(searchVO.getPageSize());           
		
		searchVO.setFirstIndex(paginationInfo.getFirstRecordIndex());          
		searchVO.setLastIndex(paginationInfo.getLastRecordIndex());            
		searchVO.setRecordCountPerPage(paginationInfo.getRecordCountPerPage()); 
		
		List<?> emps = empService.selectEmpList(searchVO); 
		model.addAttribute("emps", emps);
		
		int totCnt = empService.selectEmpListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
		model.addAttribute("paginationInfo", paginationInfo);
		
		return "basic/emp/emp_all";
	}
	
	@GetMapping("/basic/emp/addition.do")
	public String createEmpView(Model model) {
		model.addAttribute("empVO", new EmpVO()); // 유효성 체크 모델
		return "basic/emp/add_emp";
	}
	
	@PostMapping("/basic/emp/add.do")
	public String insert(@ModelAttribute EmpVO empVO, BindingResult bindingResult) throws Exception {
		
		beanValidator.validate(empVO, bindingResult);
		
		if(bindingResult.hasErrors()) {
			return "basic/emp/add_emp"; 
		}
		
		empService.insert(empVO);
		
		return "redirect:/basic/emp.do"; 
	}
	

	@GetMapping("/basic/emp/edition.do")
	public String updateEmpView(@RequestParam int eno, Model model) throws Exception {
		EmpVO empVO = empService.selectEmp(eno);
		model.addAttribute("empVO", empVO);
		return "basic/emp/update_emp";
	}
	
	@PostMapping("/basic/emp/edit.do")
	public String update(@RequestParam int eno,
							@ModelAttribute EmpVO empVO
			) throws Exception {
		empService.update(empVO);
		return "redirect:/basic/emp.do"; 
	}
	
	@PostMapping("/basic/emp/delete.do")
	public String delete(@ModelAttribute EmpVO empVO) throws Exception {
        empService.delete(empVO);
		return "redirect:/basic/emp.do"; 
	}
}









