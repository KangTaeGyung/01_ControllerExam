package egovframework.example.vo.basic;

import egovframework.example.vo.common.Criteria;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@SuppressWarnings("serial")
public class EmpVO extends Criteria {
	private int eno;            // 사원번호(기본키)
	private String ename;       // 사원명
	private String job;         // 직위
	private int manager;        // 관리자 사원번호
	private String hiredate;    // 입사일
	private int salary;         // 급여
	private int commission;     // 상여금
	private int dno;            // 부서번호
}
