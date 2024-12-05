package egovframework.example.cmmn.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ModelAndViewDefiningException;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import org.springframework.web.util.WebUtils;

import egovframework.example.vo.auth.MemberVO;

public class AuthenticInterceptor extends HandlerInterceptorAdapter {
	
	/**
	 * 세션에 계정정보(Account)가 있는지 여부로 인증 여부를 체크한다.
	 * 계정정보(Account)가 없다면, 로그인 페이지로 이동한다.
	 */
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {		
		
		// 세션에서 memberVO 가져오기
		MemberVO memberVO = (MemberVO) WebUtils.getSessionAttribute(request, "memberVO");
		
		if(memberVO!=null){
			// 사용자가 있으면 true 내보내기 => 클릭한 메뉴의 페이지가 보임
			return true;
		}else{
//			사용자가 없으면 로그인 페이지로 강제이동 : 강제 예외 발생
			ModelAndView modelAndView = new ModelAndView("redirect:/login.do");			
			throw new ModelAndViewDefiningException(modelAndView);
		}
	}
}
