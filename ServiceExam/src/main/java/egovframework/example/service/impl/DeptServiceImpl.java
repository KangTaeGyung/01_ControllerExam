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
	
	@Override
	public void insert(DeptVO deptVO) {
		deptMapper.insert(deptVO);
	}
	
	@Override
	public DeptVO selectDept(long dno) {
		DeptVO deptVo = deptMapper.selectDept(dno);
		return deptVo;
	}
	
	@Override
	public void update(DeptVO deptVO) {
		deptMapper.update(deptVO);	
	}
	
	@Override
	public void delete(long dno) {
		deptMapper.delete(dno);
	}
}




