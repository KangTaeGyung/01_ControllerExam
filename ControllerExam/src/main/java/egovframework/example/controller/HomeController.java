/**
 * 
 */
package egovframework.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author KTE
 *
 */
@Controller
public class HomeController {
	@RequestMapping(value = "/home.do", method = RequestMethod.GET)
	public String home() {
		return "home";
	}
}
