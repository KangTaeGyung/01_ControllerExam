/**
 * 
 */
package egovframework.example.service.advanced;

import java.util.List;

import egovframework.example.vo.advanced.FileDbVO;
import egovframework.example.vo.common.Criteria;

public interface FileDbService {
	List<?> selectFileDbList(Criteria searchVO) throws Exception; 
	int selectFileDbListTotCnt(Criteria searchVO);                
	void insert(FileDbVO fileDbVO) throws Exception;        
	FileDbVO selectFileDb(String uuid) throws Exception;          
	void delete(String uuid) throws Exception;              
}









