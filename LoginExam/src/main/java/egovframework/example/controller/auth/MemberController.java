package egovframework.example.controller.auth;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import egovframework.example.service.auth.MemberService;
import egovframework.example.vo.auth.MemberVO;

@Controller
public class MemberController {

    @Autowired
    private MemberService memberService;
    
//  로그인 화면
    @GetMapping("/login")
    public String loginView() {
		return "auth/login";
	}
    
    /**
     * 사용자로 부터 아이디, 패스워드를 입력받아 인증 성공이면 세션 객체에 계정정보를 담고 사원정보리스트 페이지로 포워딩한다. 인증에
     * 실패하면 로그인 페이지로 다시 리턴한다.
     */
    @PostMapping("/loginProcess")
    public String login(HttpServletRequest request, @ModelAttribute MemberVO loginVO) throws Exception {
    	
        // TODO [Step 4-1-01] LoginService의 authenticate메소드를 이용하여 
    	// 로긴여부 체크 Member 객체를 리턴 받는다.
    	MemberVO memberVO = (MemberVO) memberService.authenticateMember(loginVO);

//    	회원이 없으면
    	if(memberVO == null) throw new Exception("회원이 없습니다. ");
    	
        /*
         * TODO [Step 4-1-03] 가져온 account 객체가 null 아닌 경우
         * request.getSession() 메소드를 통해 Session을 구해 UserMember 이름으로 Session 에
         * Attribute로 저장한다. 그리고 "redirect:/loginSuccess.do" 값을 반환한다. null 인경우
         * "login" 반환한다.
         */
        request.getSession().setAttribute("memberVO", memberVO);
        return "redirect:/"; // 홈(첫페이지)로 이동
    	
    } 
    
//  회원 가입 화면 
    @GetMapping("/register")
    public String registerView() {
		return "auth/register";
	}
    
//  가입 버튼 클릭시 실행될 함수
    @PostMapping("/register/addition")
    public String register(HttpServletRequest request, @ModelAttribute MemberVO memberVO) throws Exception {
    	
    	MemberVO memberVO2 = (MemberVO) memberService.authenticateMember(memberVO);
    	
//    	로그인이 되어 있으면 회원이므로 회원가입 필요없음. / 으로 이동시킴
    	if(memberVO2 != null) {
    		throw new Exception("이미 가입되어 있습니다. ");
    	}
    	
//    	서비스의 insert 함수 실행
    	memberService.registerMember(memberVO);

        return "redirect:/"; // 홈(첫페이지)로 이동
    	
    } 
    
//  로그아웃 화면 
    @GetMapping("/logout")
    public String logout(HttpSession httpSession) {
    	httpSession.removeAttribute("memberVO"); // 세션에 객체 삭제 
    	httpSession.invalidate();                // 무효화
		return "redirect:/login";                // 로그인 페이지로 강제이동 
	}
}
