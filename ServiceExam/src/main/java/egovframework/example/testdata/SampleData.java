package egovframework.example.testdata;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import egovframework.example.vo.DeptVO;
import lombok.Getter;
import lombok.Setter;

/**
 * author : simple-coding
 * date : 2023/07/13
 * description : 가짜 부서 DB
 * 요약 : 실습용 미리 제공되는 클래스 , 수정 하지 마세요
 */
@Component
@Getter
@Setter
public class SampleData {
    List<DeptVO> list = new ArrayList<DeptVO>();

    public SampleData() {

    	DeptVO dept = DeptVO.builder()
                .dno(10)
                .dname("Accounting")
                .loc("Pusan")
                .build();

        list.add(dept);

        dept = DeptVO.builder()
                .dno(20)
                .dname("Marketing")
                .loc("Seoul")
                .build();

        list.add(dept);

        dept = DeptVO.builder()
                .dno(30)
                .dname("Sales")
                .loc("DaeGu")
                .build();

        list.add(dept);

        dept = DeptVO.builder()
                .dno(40)
                .dname("Development")
                .loc("Seoul")
                .build();

        list.add(dept);
    }
}
