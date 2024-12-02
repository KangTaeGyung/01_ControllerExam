package egovframework.example.service.basic;

import java.util.List;

import egovframework.example.vo.basic.EmpVO;
import egovframework.example.vo.common.Criteria;

public interface EmpService {
	List<?> selectEmpList(Criteria searchVO) throws Exception;
	int selectEmpListTotCnt(Criteria searchVO);    
	void insertEmp(EmpVO empVO) throws Exception;  
	EmpVO selectEmp(int eno) throws Exception;     
	void updateEmp(EmpVO empVO) throws Exception;  
	void deleteEmp(EmpVO empVO) throws Exception;  
}




