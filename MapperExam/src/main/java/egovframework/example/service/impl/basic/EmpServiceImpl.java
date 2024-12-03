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

@Service
public class EmpServiceImpl implements EmpService{
	
	@Autowired
	EmpMapper empMapper; 
	
	@Override
	public List<?> selectEmpList(Criteria searchVO) throws Exception {
		return empMapper.selectEmpList(searchVO);
	}

	@Override
	public int selectEmpListTotCnt(Criteria searchVO) {
		return empMapper.selectEmpListTotCnt(searchVO);
	}
	
	@Override
	public void insert(EmpVO empVO) throws Exception {
		empMapper.insert(empVO);
	}
	
	@Override
	public EmpVO selectEmp(int eno) throws Exception {
		EmpVO empVO = empMapper.selectEmp(eno);
		return empVO;
	}
	
	@Override
	public void update(EmpVO empVO) throws Exception {
		empMapper.update(empVO);
	}
	
	@Override
	public void delete(EmpVO empVO) throws Exception {
		empMapper.delete(empVO);
	}
}






