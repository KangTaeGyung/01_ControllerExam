/**
 * 
 */
package egovframework.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import egovframework.example.mapper.DeptMapper;
import egovframework.example.service.DeptService;
import egovframework.example.vo.DeptVO;

@Service
public class DeptServiceImpl implements DeptService{

	@Autowired
	DeptMapper deptMapper;
	
	@Override
	public List<DeptVO> selectAll() {
		List<DeptVO> list = deptMapper.selectAll();
		return list;
	}
	
//	함수 재정의 : source 메뉴
	@Override
	public void insert(DeptVO deptVO) {
//		   TODO: 1) 새로운 부서번호(dno) 를 생성 : 시퀀스 이용(향후), 지금(함수실행)
//		setSequence(deptVo);
		// TODO DB 부서테이블에 insert 함수 실행 : 2) 강사가 코딩한 함수 실행
//		   객체지향 코딩 : 객체의 함수를 실행하는 것
		deptMapper.insert(deptVO);
	}
	
//	부서번호 자동증가 함수
	public void setSequence(DeptVO deptVO) {
		int count = deptMapper.selectAll().size();
		int newNum = (count + 1) * 10;
		deptVO.setDno(newNum);
	}
	
//	상세조회 함수 : source 메뉴 - Override/implement ...
	@Override
	public DeptVO selectDept(long dno) {
		// TODO 상세조회 함수 실행 : 객체에 있음
		DeptVO deptVo = deptMapper.selectDept(dno);
		return deptVo;
	}
	
//	수정함수  : source 메뉴 - Override/implement ...
	@Override
	public void update(DeptVO deptVO) {
		// TODO : deptMapper 객체 (CRUD 함수들 있음)
		deptMapper.update(deptVO);	
	}
	
//	삭제함수 : source 메뉴 - Override/implement ...
	@Override
	public void delete(long dno) {
		// TODO deptMapper 객체의 삭제함수(delete..) 실행
		deptMapper.delete(dno);
	}
}




