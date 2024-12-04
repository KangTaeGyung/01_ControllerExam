package egovframework.example.mapper.auth;

import org.egovframe.rte.psl.dataaccess.mapper.Mapper;

import egovframework.example.vo.auth.MemberVO;

@Mapper
public interface MemberMapper {

	public MemberVO authenticate(MemberVO memberVO);
	
    public void register(MemberVO memberVO);
}
