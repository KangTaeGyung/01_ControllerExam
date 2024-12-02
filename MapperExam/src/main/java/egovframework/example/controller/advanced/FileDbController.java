/**
 * 
 */
package egovframework.example.controller.advanced;

import java.util.List;

import org.egovframe.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import egovframework.example.service.advanced.FileDbService;
import egovframework.example.vo.advanced.FileDbVO;
import egovframework.example.vo.common.Criteria;
import lombok.extern.log4j.Log4j;

@Log4j
@Controller
public class FileDbController {

	@Autowired
	FileDbService fileDbService; 

	@GetMapping("/advanced/fileDb")
	public String selectFileDbList(@ModelAttribute("searchVO") Criteria searchVO, Model model) throws Exception {
		searchVO.setPageUnit(3); 
		searchVO.setPageSize(2); 
		
		PaginationInfo paginationInfo = new PaginationInfo();         
		paginationInfo.setCurrentPageNo(searchVO.getPageIndex());     
		paginationInfo.setRecordCountPerPage(searchVO.getPageUnit()); 
		paginationInfo.setPageSize(searchVO.getPageSize());           
		
		searchVO.setFirstIndex(paginationInfo.getFirstRecordIndex());           
		searchVO.setLastIndex(paginationInfo.getLastRecordIndex());             
		searchVO.setRecordCountPerPage(paginationInfo.getRecordCountPerPage()); 
			
		List<?> fileDBs = fileDbService.selectFileDbList(searchVO);
		model.addAttribute("fileDBs", fileDBs);
		
		int totCnt = fileDbService.selectFileDbListTotCnt(searchVO);

		paginationInfo.setTotalRecordCount(totCnt);
		model.addAttribute("paginationInfo", paginationInfo);
		
		return "advanced/fileDb/fileDb_all";
	}

//	추가 페이지 열기 :
	@GetMapping("/advanced/fileDb/addition")
	public String createFileDbView() {
		return "advanced/fileDb/add_fileDb";
	}
	
	@PostMapping("/advanced/fileDb/add")
	public String createFileDb(@RequestParam(defaultValue = "") String fileTitle,
							@RequestParam(defaultValue = "") String fileContent,
							@RequestParam(required = false) MultipartFile image
			) throws Exception {
		FileDbVO fileDbVO = new FileDbVO(fileTitle, fileContent, image.getBytes());
		fileDbService.insertFileDb(fileDbVO);
		return "redirect:/advanced/fileDb"; 
	}
	
	@GetMapping("/advanced/fileDb/{uuid}")
	@ResponseBody
	public ResponseEntity<byte[]> findDownload(@PathVariable String uuid) throws Exception {
		FileDbVO fileDbVO = fileDbService.selectFileDb(uuid);
		
        HttpHeaders headers = new HttpHeaders();             
        headers.setContentDispositionFormData("attachment", fileDbVO.getUuid()); 
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);              

        return new ResponseEntity<byte[]>(fileDbVO.getFileData(), headers, HttpStatus.OK);
	}
	
	@PostMapping("/advanced/fileDb/delete")
	public String deleteFileDb(@RequestParam(defaultValue = "") String uuid) throws Exception {
		log.info("테스트 : " + uuid);
		fileDbService.deleteFileDb(uuid);
		return "redirect:/advanced/fileDb"; 
	}
}









