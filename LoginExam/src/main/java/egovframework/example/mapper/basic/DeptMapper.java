/**
 * 
 */
package egovframework.example.mapper.basic;

import java.util.List;

import org.egovframe.rte.psl.dataaccess.mapper.Mapper;

import egovframework.example.vo.basic.DeptVO;
import egovframework.example.vo.common.Criteria;

// TODO: 반드시 전자정부프레임워크 용 @Mapper 를 import 해야 컴포넌트 스캔에러가 발생 안됨
@Mapper
public interface DeptMapper {
	public List<?> selectDeptList(Criteria searchVO);   // 전체 조회
	public int selectDeptListTotCnt(Criteria searchVO); // 개수 세기 
	public int insert(DeptVO deptVO);                   // insert 함수
	public DeptVO selectDept(int dno);                  // 상세조회 함수
	public int update(DeptVO deptVO);                   // update 함수
	public int delete(DeptVO deptVO);                   // delete 함수
}






