package egovframework.example.testdata;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import egovframework.example.vo.MemberVO;
import lombok.Getter;
import lombok.Setter;

/**
 * author : simple-coding
 * date : 2023/07/13
 * description : 가짜 회원 DB
 * 요약 : 실습용 미리 제공되는 클래스 , 수정 하지 마세요
 */
@Component
@Getter
@Setter
public class SampleMember {
    List<MemberVO> list = new ArrayList<MemberVO>();

    public SampleMember() {

    	MemberVO member = MemberVO.builder()
                .eno(7369)
                .ename("SMITH")
                .job("CLERK")
                .manager(7902)
                .build();
        list.add(member);

        member = MemberVO.builder()
                .eno(7499)
                .ename("SMITH")
                .job("CLERK")
                .manager(7698)
                .build();
        list.add(member);

        member = MemberVO.builder()
                .eno(7521)
                .ename("SMITH")
                .job("CLERK")
                .manager(7698)
                .build();
        list.add(member);

        member = MemberVO.builder()
                .eno(7566)
                .ename("SMITH")
                .job("CLERK")
                .manager(7839)
                .build();
        list.add(member);

        member = MemberVO.builder()
                .eno(7654)
                .ename("SMITH")
                .job("CLERK")
                .manager(7698)
                .build();
        list.add(member);

    }
}
