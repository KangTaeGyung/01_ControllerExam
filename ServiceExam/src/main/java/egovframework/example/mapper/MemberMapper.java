package egovframework.example.mapper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import egovframework.example.testdata.SampleMember;
import egovframework.example.vo.MemberVO;

/**
 * author : simple-coding
 * date : 2023/07/13
 * description : 가짜 회원 DB CRUD 함수 정의 
 * 요약 : 실습용 미리 제공되는 클래스 , 수정 하지 마세요
 */
@Repository
public class MemberMapper {

    @Autowired
    SampleMember sampleMember;

    //    모든 샘를 데이터 조회 함수
    public List<MemberVO> selectAll() {
        List<MemberVO> list = sampleMember.getList();

        return list;
    }

    //    아이디로 조회하는 함수
    public MemberVO selectMember(long eno) {
        List<MemberVO> list = sampleMember.getList();

        MemberVO resDept = null;

//        id에 해당하는 값 찾기
        for (MemberVO element : list) {
            if(element.getEno() == eno) {
                resDept = element;
            }
        }

        return resDept;
    }

//    데이터를 저장하는 함수
    public List<MemberVO> insert(MemberVO member) {

        List<MemberVO> list = sampleMember.getList();

        int count = selectAll().size(); // 전체 건수
        int newId = count + 8000;
        member.setEno(newId); // 새로운 번호 저장

        list.add(member);

        sampleMember.setList(list);

        return sampleMember.getList();
    }

//    데이터를 수정하는 함수
    public List<MemberVO> update(MemberVO member) {

        List<MemberVO> list = sampleMember.getList();

        if(member.getEno() != null) {
            //            수정
            for (MemberVO element : list) {
                if ((int)element.getEno() == (int)member.getEno()) {
                    element.setEname(member.getEname());
                    element.setJob(member.getJob());
                    element.setManager(member.getManager());
                    element.setUpdateTime(member.getUpdateTime());
                }
            }
        }

        return list;
    }

//  데이터를 삭제하는 함수
    public int delete(long id) {
        List<MemberVO> list = sampleMember.getList();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getEno() == id) {
                list.remove(i);
                return 1;
            }
        }

        return 0;
    }
}











