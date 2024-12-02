/**
 * 
 */
package egovframework.example.mapper.basic;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import egovframework.example.vo.basic.DeptVO;
import egovframework.example.vo.common.Criteria;

@Mapper
public interface DeptMapper {
	public List<?> selectDeptList(Criteria searchVO);   // 전체 조회
	public int selectDeptListTotCnt(Criteria searchVO); // 개수 세기 
	public int insert(DeptVO deptVO);                   // insert 함수
	public DeptVO selectDept(int dno);                  // 상세조회 함수
	public int update(DeptVO deptVO);                   // update 함수
	public int delete(DeptVO deptVO);                   // delete 함수
}






