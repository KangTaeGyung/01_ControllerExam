package egovframework.example.service.advanced;

import java.util.List;

import egovframework.example.vo.advanced.FileDbVO;
import egovframework.example.vo.advanced.GalleryVO;
import egovframework.example.vo.common.Criteria;

public interface GalleryService {
	List<?> selectGalleryList(Criteria searchVO) throws Exception; 
	int selectGalleryListTotCnt(Criteria searchVO);                
	void insert(GalleryVO galleryVO) throws Exception;      
	GalleryVO selectGallery(String uuid) throws Exception;          
	void delete(String uuid) throws Exception;  
}






