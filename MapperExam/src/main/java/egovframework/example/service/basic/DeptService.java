/**
 * 
 */
package egovframework.example.service.basic;

import java.util.List;

import egovframework.example.vo.basic.DeptVO;
import egovframework.example.vo.common.Criteria;

public interface DeptService {
	List<?> selectDeptList(Criteria searchVO) throws Exception;
	int selectDeptListTotCnt(Criteria searchVO);     
	void insert(DeptVO deptVO) throws Exception; 
	DeptVO selectDept(int dno) throws Exception;     
	void update(DeptVO deptVO) throws Exception; 
	void delete(DeptVO deptVO) throws Exception; 
}










