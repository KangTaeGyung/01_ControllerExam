/**
 * 
 */
package egovframework.example.service.impl.basic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import egovframework.example.mapper.basic.DeptMapper;
import egovframework.example.service.basic.DeptService;
import egovframework.example.vo.basic.DeptVO;
import egovframework.example.vo.common.Criteria;

@Service
public class DeptServiceImpl implements DeptService {
	
//	객체지향코딩 : DB 와 연결된 객체 - DeptMapper
	@Autowired
	private DeptMapper deptMapper;

//	함수 재정의 : source
	@Override
	public List<?> selectDeptList(Criteria searchVO) throws Exception {
		// TODO : 전체 조회
		return deptMapper.selectDeptList(searchVO);
	}
	
//	개수 세기 함수 : source 
	@Override
	public int selectDeptListTotCnt(Criteria searchVO) {
		// TODO deptMapper.개수세기함수 실행
		return deptMapper.selectDeptListTotCnt(searchVO);
	}
	
//	insert 함수 : source 
	@Override
	public void insertDept(DeptVO deptVO) throws Exception {
		// TODO deptMapper 의 insert 함수 실행 : 내부 sql 문 실행
		deptMapper.insert(deptVO);
	}
	
//	상세조회 : source
	@Override
	public DeptVO selectDept(int dno) throws Exception {
		// TODO deptMapper 의 상세조회 함수 실행
		DeptVO deptVO = deptMapper.selectDept(dno);
		return deptVO;
	}

//	udpate : source
	@Override
	public void updateDept(DeptVO deptVO) throws Exception {
		// TODO 1) deptMapper 함수를 실행(sql문실행) 2) 업무로직을 추가(생략)
		deptMapper.update(deptVO);
	}

//	삭제 : source
	@Override
	public void deleteDept(DeptVO deptVO) throws Exception {
		// TODO 1) deptMapper 함수를 실행(sql문실행) 2) 업무로직을 추가(생략)
		deptMapper.delete(deptVO);
	}
}








