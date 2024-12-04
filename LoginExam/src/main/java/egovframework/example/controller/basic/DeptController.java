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

import egovframework.example.service.basic.DeptService;
import egovframework.example.vo.basic.DeptVO;
import egovframework.example.vo.common.Criteria;
import lombok.extern.log4j.Log4j;

@Log4j
@Controller
public class DeptController {

	@Autowired
	private DeptService deptService;
	
	/** 유효성 체크 객체 */
	@Resource(name = "beanValidator")
	protected DefaultBeanValidator beanValidator;
	
	@GetMapping("/basic/dept.do")
	public String selectDeptList(
			@ModelAttribute("searchVO") Criteria searchVO,
			Model model) throws Exception {
		searchVO.setPageUnit(3); 
		searchVO.setPageSize(2); 
		
		PaginationInfo paginationInfo = new PaginationInfo();         
		paginationInfo.setCurrentPageNo(searchVO.getPageIndex());     
		paginationInfo.setRecordCountPerPage(searchVO.getPageUnit()); 
		paginationInfo.setPageSize(searchVO.getPageSize());           
		
		searchVO.setFirstIndex(paginationInfo.getFirstRecordIndex());           
		searchVO.setLastIndex(paginationInfo.getLastRecordIndex());             
		searchVO.setRecordCountPerPage(paginationInfo.getRecordCountPerPage()); 
		
		List<?> depts = deptService.selectDeptList(searchVO);
		model.addAttribute("depts", depts);
		
		int totCnt = deptService.selectDeptListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
		model.addAttribute("paginationInfo", paginationInfo);
		
		return "basic/dept/dept_all";
	}

//	추가 페이지 열기 함수
	@GetMapping("/basic/dept/addition.do")
	public String createDeptView(Model model) {
		model.addAttribute("deptVO", new DeptVO()); // 유효성 체크 모델
		return "basic/dept/add_dept";
	}

	@PostMapping("/basic/dept/add.do")
	public String insert(@ModelAttribute DeptVO deptVO, BindingResult bindingResult) throws Exception {
		
		beanValidator.validate(deptVO, bindingResult);
		
		if(bindingResult.hasErrors()) {
			return "basic/dept/add_dept";
		}
		
		log.info("테스트 " + deptVO);
		deptService.insert(deptVO);
		
		return "redirect:/basic/dept.do";
	}
	
	@GetMapping("/basic/dept/edition.do")
	public String updateDeptView(@RequestParam int dno, Model model) 
			      throws Exception {
		DeptVO deptVO = deptService.selectDept(dno);
		model.addAttribute("deptVO", deptVO);
		return "basic/dept/update_dept";
	}
	
	@PostMapping("/basic/dept/edit.do")
	public String update(@RequestParam int dno,
							@ModelAttribute DeptVO deptVO
			) throws Exception {
		deptService.update(deptVO);
		return "redirect:/basic/dept.do"; 
	}
	
	@PostMapping("/basic/dept/delete.do")
	public String delete(@ModelAttribute DeptVO deptVO) throws Exception
	{
        deptService.delete(deptVO);
		return "redirect:/basic/dept.do"; 
	}
}






