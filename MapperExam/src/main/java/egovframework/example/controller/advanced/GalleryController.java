/**
 * 
 */
package egovframework.example.controller.advanced;

import java.util.List;

import org.egovframe.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import egovframework.example.service.advanced.GalleryService;
import egovframework.example.vo.advanced.GalleryVO;
import egovframework.example.vo.common.Criteria;

@Controller
public class GalleryController {

	@Autowired
	GalleryService galleryService; 

	@GetMapping("/advanced/gallery")
	public String selectGalleryList(@ModelAttribute("searchVO") Criteria searchVO, Model model) throws Exception {
		searchVO.setPageUnit(3); 
		searchVO.setPageSize(2); 

		PaginationInfo paginationInfo = new PaginationInfo(); 
		paginationInfo.setCurrentPageNo(searchVO.getPageIndex()); 
		paginationInfo.setRecordCountPerPage(searchVO.getPageUnit()); 
		paginationInfo.setPageSize(searchVO.getPageSize()); 

		searchVO.setFirstIndex(paginationInfo.getFirstRecordIndex()); 
		searchVO.setLastIndex(paginationInfo.getLastRecordIndex()); 
		searchVO.setRecordCountPerPage(paginationInfo.getRecordCountPerPage()); 

		List<?> gallerys = galleryService.selectGalleryList(searchVO);
		model.addAttribute("gallerys", gallerys);
		
		int totCnt = galleryService.selectGalleryListTotCnt(searchVO);
		
		paginationInfo.setTotalRecordCount(totCnt);
		model.addAttribute("paginationInfo", paginationInfo);
		
		return "advanced/gallery/gallery_all";
	}
	
	@GetMapping("/advanced/gallery/addition")
	public String createGalleryView() {
		return "advanced/gallery/add_gallery";
	}
	
	@PostMapping("/advanced/gallery/add")
	public String createGallery(@RequestParam(defaultValue = "") String galleryTitle,
							@RequestParam(required = false) MultipartFile image
			) throws Exception {
		GalleryVO galleryVO = new GalleryVO(galleryTitle, image.getBytes());
		galleryService.insertGallery(galleryVO);
		return "redirect:/advanced/gallery"; 
	}
}
