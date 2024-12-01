package egovframework.example.service;

import java.util.List;
import egovframework.example.vo.MemberVO;

public interface MemberService {
	List<MemberVO> selectAll();
	void insert(MemberVO memberVO);
	MemberVO selectMember(long eno);
	void update(MemberVO memberVO); 
	void delete(long eno);          
}
