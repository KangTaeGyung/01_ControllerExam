package egovframework.example.mapper.advanced;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import egovframework.example.vo.advanced.FileDbVO;
import egovframework.example.vo.common.Criteria;

@Mapper
public interface FileDbMapper {
	public List<?> selectFileDbList(Criteria searchVO);   // 전체조회 함수
	public int selectFileDbListTotCnt(Criteria searchVO); // 테이블 총개수 함수
	public int insert(FileDbVO fileDbVO);                 // insert 함수
	public FileDbVO selectFileDb(String  uuid);           // 상세조회 함수
	public int delete(String uuid);                       // delete 함수
}





