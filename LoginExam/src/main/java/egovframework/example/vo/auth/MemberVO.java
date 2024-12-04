package egovframework.example.vo.auth;

import egovframework.example.vo.common.Criteria;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * packageName : org.example.loginexam.model.entity.auth
 * fileName : Member
 * author : GGG
 * date : 2024-03-26
 * description : 로그인 사용자 클래스
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-26         GGG          최초 생성
 */
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuppressWarnings("serial")
public class MemberVO extends Criteria {
    private String email;    // 기본키, 로그인 id (스프링시큐리티 속성 : username)
    private String password; // 암호
    private String name;     // 유저명
}
