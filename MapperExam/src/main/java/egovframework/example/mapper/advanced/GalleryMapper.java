package egovframework.example.mapper.advanced;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import egovframework.example.vo.advanced.GalleryVO;
import egovframework.example.vo.common.Criteria;

@Mapper
public interface GalleryMapper {
	public List<?> selectGalleryList(Criteria searchVO);   // 전체조회 함수
	public int selectGalleryListTotCnt(Criteria searchVO); // 테이블 총개수 함수
	public int insert(GalleryVO galleryVO);                 // insert 함수
	public GalleryVO selectGallery(String  uuid);           // 상세조회 함수
}





