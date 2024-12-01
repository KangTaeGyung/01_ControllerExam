package egovframework.example.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class DeptVO {
    int dno;       // 부서번호
    String  dname; // 부서명
    String  loc;   // 부서위치
}