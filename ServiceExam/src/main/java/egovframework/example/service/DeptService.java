/**
 * 
 */
package egovframework.example.service;

import java.util.List;
import egovframework.example.vo.DeptVO;

public interface DeptService {
	List<DeptVO> selectAll();   
	void insert(DeptVO deptVO); 
	DeptVO selectDept(long dno);
	void update(DeptVO deptVO); 
	void delete(long dno);      
}





