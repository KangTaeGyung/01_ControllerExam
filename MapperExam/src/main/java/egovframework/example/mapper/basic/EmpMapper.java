/**
 * 
 */
package egovframework.example.mapper.basic;

import java.util.List;

import egovframework.example.vo.basic.EmpVO;
import egovframework.example.vo.common.Criteria;

public interface EmpMapper {
	public List<?> selectEmpList(Criteria searchVO);   // 전체 조회
	public int selectEmpListTotCnt(Criteria searchVO); // 개수 세기
	public int insert(EmpVO empVO);                    // insert 함수
	public EmpVO selectEmp(int eno);                   // 상세조회 함수
	public int update(EmpVO empVO);                    // update 함수
	public int delete(EmpVO empVO);                    // delete 함수
}



