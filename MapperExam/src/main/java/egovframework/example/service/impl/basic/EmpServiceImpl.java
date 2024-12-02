/**
 * 
 */
package egovframework.example.service.impl.basic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import egovframework.example.mapper.basic.EmpMapper;
import egovframework.example.service.basic.EmpService;
import egovframework.example.vo.basic.EmpVO;
import egovframework.example.vo.common.Criteria;

/**
  * @fileName : EmpServiceImpl.java
  * @author : KTE
  * @since : 2024. 9. 6. 
  * description :
  */
@Service
public class EmpServiceImpl implements EmpService{
	
	@Autowired
	EmpMapper empMapper; // DB 연결 매퍼
	
//	전체 조회 : source 함수 재정의 
	@Override
	public List<?> selectEmpList(Criteria searchVO) throws Exception {
		// TODO empMapper.전체조회 실행
		return empMapper.selectEmpList(searchVO);
	}

//	개수 세기 : 페이징 - source
	@Override
	public int selectEmpListTotCnt(Criteria searchVO) {
		// TODO empMapper 객체 함수 실행 -> 내부(sql문 실행)
		return empMapper.selectEmpListTotCnt(searchVO);
	}
	
//	insert 함수
	@Override
	public void insert(EmpVO empVO) throws Exception {
		// TODO empMapper 의 insert 함수 실행 : 내부 sql 문 실행
//		  자동정렬 : ctrl + alt + l
		empMapper.insert(empVO);
	}
	
//	상세조회 : source
	@Override
	public EmpVO selectEmp(int eno) throws Exception {
		// TODO empMapper 상세조회 함수실행
		EmpVO empVO = empMapper.selectEmp(eno);
		return empVO;
	}
	
//	update : source
	@Override
	public void update(EmpVO empVO) throws Exception {
		// TODO empMapper 의 update 함수 실행, 업무로직 (생략)
		empMapper.update(empVO);
	}
	
//	delete : source
	@Override
	public void delete(EmpVO empVO) throws Exception {
		// TODO empMapper 의 delete 함수 실행, 업무로직 (생략)
		empMapper.delete(empVO);
	}
}






