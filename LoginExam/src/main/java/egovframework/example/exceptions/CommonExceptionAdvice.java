package egovframework.example.exceptions;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.multipart.MaxUploadSizeExceededException;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

// TODO: 전자정부프레임워크 전역 예외처리 : @EnableWebMvc 붙여야 함
@Log4j
@ControllerAdvice
@EnableWebMvc
public class CommonExceptionAdvice {

//  컨트롤러에서 어떤 에러가 발생하더라도 이 함수가 실행됨
    @ExceptionHandler(Exception.class)
    public String internalServerErrorException(Exception e
    		, RedirectAttributes redirectAttributes
    		) {
        String errors = "에러 : " + e.getMessage();
        log.info(errors);
        redirectAttributes.addFlashAttribute("errors", errors); // errors.jsp 로 에러내용 전달
        
        return "redirect:/errors.do";
    }
}