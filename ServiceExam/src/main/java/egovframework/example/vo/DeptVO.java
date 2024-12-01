package egovframework.example.vo;

import lombok.*;

/**
 * author : simple-coding
 * date : 2023/07/13
 * description : 부서 VO 클래스
 * 요약 : 실습용 미리 제공되는 클래스 , 수정 하지 마세요
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
public class DeptVO extends BaseTimeEntity {
    private Integer dno;  //    부서번호
    private String dname; //    부서이름
    private String loc;   //    부서위치

    @Builder
    public DeptVO(Integer dno, String dname, String loc) {
        super();
        this.dno = dno;
        this.dname = dname;
        this.loc = loc;
    }
}





















