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
	MemberMapper memberMapper;

	@Override
	public List<MemberVO> selectAll() {
		// TODO Member 전체 조회
		List<MemberVO> list = memberMapper.selectAll();
		return list;
	}
	
//	사원번호 자동증가 함수
	public void setSequence(MemberVO memberVO) {
		int count = memberMapper.selectAll().size();
		int newNum = (count + 1) * 8000;
		memberVO.setEno(newNum);
	}

	@Override
	public void insert(MemberVO memberVO) {
//	      (1) 사원번호 자동 증가 : 시퀀스(향후)
		setSequence(memberVO);
//        (2) memberMapper 의 insertXXX 함수 실행
		memberMapper.insert(memberVO);
	}
	
//	상세조회 함수
	@Override
	public MemberVO selectMember(long eno) {
		// TODO memberMapper.selectById() 실행 : 사원 상세조회 
		MemberVO memberVO = memberMapper.selectMember(eno);
		return memberVO;
	}
	
//	수정함수 재정의
	@Override
	public void update(MemberVO memberVO) {
		// TODO memberMapper 객체 의 update 함수 실행
		memberMapper.update(memberVO);
	}
	
//	삭제 함수 : source - override/imple...
	@Override
	public void delete(long eno) {
		// TODO memberMapper 객체 의 delete 함수 실행
		memberMapper.delete(eno);
		
	}
}






