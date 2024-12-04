package egovframework.example.service.auth;

import egovframework.example.vo.auth.MemberVO;

public interface MemberService {
	
	public MemberVO authenticateMember(MemberVO loginVO) throws Exception;	
	
	public void registerMember(MemberVO memberVO);
}
