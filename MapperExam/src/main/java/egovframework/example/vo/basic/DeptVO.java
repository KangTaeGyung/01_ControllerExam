/**
 * 
 */
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
public class DeptVO extends Criteria {
	private int dno;           // 부서번호(기본키)
	private String dname;      // 부서명
	private String loc;        // 부서위치
}






