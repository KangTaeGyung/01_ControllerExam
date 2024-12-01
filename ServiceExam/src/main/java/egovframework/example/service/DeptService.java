/**
 * 
 */
package egovframework.example.service;

import java.util.List;
import egovframework.example.vo.DeptVO;

public interface DeptService {
	List<DeptVO> selectAll();         // 전체 조회 함수
	void insert(DeptVO deptVO); // insert 함수
	DeptVO selectDept(long dno);      // 상세조회 함수
	void update(DeptVO deptVO); // update 함수
	void delete(long dno);      // delete 함수
}





