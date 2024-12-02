package egovframework.example.service.advanced;

import java.util.List;

import egovframework.example.vo.advanced.GalleryVO;
import egovframework.example.vo.common.Criteria;

public interface GalleryService {
	List<?> selectGalleryList(Criteria searchVO) throws Exception; 
	int selectGalleryListTotCnt(Criteria searchVO);                
	void insertGallery(GalleryVO galleryVO) throws Exception;      
}






