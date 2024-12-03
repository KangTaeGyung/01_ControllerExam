package egovframework.example.mapper.advanced;

import java.util.List;

import org.egovframe.rte.psl.dataaccess.mapper.Mapper;

import egovframework.example.vo.advanced.FileDbVO;
import egovframework.example.vo.common.Criteria;

//TODO: 반드시 전자정부프레임워크 용 @Mapper 를 import 해야 컴포넌트 스캔에러가 발생 안됨
@Mapper
public interface FileDbMapper {
	public List<?> selectFileDbList(Criteria searchVO);   
	public int selectFileDbListTotCnt(Criteria searchVO); 
	public int insert(FileDbVO fileDbVO);                 
	public FileDbVO selectFileDb(String  uuid);           
	public int delete(String uuid);                       
}





