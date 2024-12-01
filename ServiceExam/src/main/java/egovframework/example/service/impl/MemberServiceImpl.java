/**
 * 
 */
package egovframework.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import egovframework.example.mapper.MemberMapper;
import egovframework.example.service.MemberService;
import egovframework.example.vo.MemberVO;

@Service
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberMapper memberMapper;

	@Override
	public List<MemberVO> selectAll() {
		List<MemberVO> list = memberMapper.selectAll();
		return list;
	}
	
	@Override
	public void insert(MemberVO memberVO) {
		memberMapper.insert(memberVO);
	}
	
	@Override
	public MemberVO selectMember(long eno) {
		MemberVO memberVO = memberMapper.selectMember(eno);
		return memberVO;
	}
	
	@Override
	public void update(MemberVO memberVO) {
		memberMapper.update(memberVO);
	}
	
	@Override
	public void delete(long eno) {
		memberMapper.delete(eno);
		
	}
}






