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
	void insertFileDb(FileDbVO fileDbVO) throws Exception;        
	FileDbVO selectFileDb(String uuid) throws Exception;          
	void deleteFileDb(String uuid) throws Exception;              
}









