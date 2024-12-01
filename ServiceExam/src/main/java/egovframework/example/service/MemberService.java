package egovframework.example.service;

import java.util.List;
import egovframework.example.vo.MemberVO;

public interface MemberService {
//	간단연습 1) findAll() 함수를 작성하고 리턴값은 List<MemberVo> 하세요
//	import MemberVo 하세요
	List<MemberVO> selectAll();
	void insert(MemberVO memberVO);
	MemberVO selectMember(long eno);          // 상세조회 함수
	void update(MemberVO memberVO); // update 함수
	void delete(long eno);          // delete 함수
}
