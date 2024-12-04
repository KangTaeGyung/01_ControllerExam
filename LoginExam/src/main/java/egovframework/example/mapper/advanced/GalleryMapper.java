package egovframework.example.mapper.advanced;

import java.util.List;

import org.egovframe.rte.psl.dataaccess.mapper.Mapper;

import egovframework.example.vo.advanced.GalleryVO;
import egovframework.example.vo.common.Criteria;

//TODO: 반드시 전자정부프레임워크 용 @Mapper 를 import 해야 컴포넌트 스캔에러가 발생 안됨
@Mapper
public interface GalleryMapper {
	public List<?> selectGalleryList(Criteria searchVO);   
	public int selectGalleryListTotCnt(Criteria searchVO); 
	public int insert(GalleryVO galleryVO);                 
	public GalleryVO selectGallery(String  uuid);          
	public int delete(String uuid);                       
}





