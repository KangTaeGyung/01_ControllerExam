/**
 * 
 */
package egovframework.example.service.impl.advanced;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import egovframework.example.mapper.advanced.GalleryMapper;
import egovframework.example.service.advanced.GalleryService;
import egovframework.example.vo.advanced.FileDbVO;
import egovframework.example.vo.advanced.GalleryVO;
import egovframework.example.vo.common.Criteria;

@Service
public class GalleryServiceImpl implements GalleryService {
	
	@Autowired
	GalleryMapper galleryMapper; 

	@Override
	public List<?> selectGalleryList(Criteria searchVO) throws Exception {
		return galleryMapper.selectGalleryList(searchVO);
	}
	
	@Override
	public int selectGalleryListTotCnt(Criteria searchVO) {
		return galleryMapper.selectGalleryListTotCnt(searchVO);
	}
	
	@Override
	public void insert(GalleryVO galleryVO) throws Exception {
		    String newUuid = UUID.randomUUID().toString(); 
		    String fileDownloadURL = generateDownloadUrl(newUuid);
		    galleryVO.setUuid(newUuid);
		    galleryVO.setGalleryFileUrl(fileDownloadURL);
		    
		    galleryMapper.insert(galleryVO);
	}
	
	public String generateDownloadUrl(String uuid) {
        return ServletUriComponentsBuilder      
          .fromCurrentContextPath()             
          .path("/advanced/gallery/download.do") 
          .query("uuid="+uuid)                  
          .toUriString();                       
	}
	
	@Override
	public GalleryVO selectGallery(String uuid) throws Exception {
		GalleryVO galleryVO = galleryMapper.selectGallery(uuid);
		return galleryVO;
	}
	
	@Override
	public void delete(String uuid) throws Exception {
		galleryMapper.delete(uuid);
	}
}






