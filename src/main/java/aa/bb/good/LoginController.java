package aa.bb.good;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

//방법1 : 전통적인 방법
/*
@Controller
public class LoginController {
	@RequestMapping(value="login", method=RequestMethod.GET)
	public ModelAndView submit(HttpServletRequest request) {
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		String data = "";
		if(id.equals("aa") && pwd.equals("11")) {
			data = "와우 성공";
		}else {
			data = "ㅠㅠ 실패";
		}
		ModelAndView view = new ModelAndView("list");
		view.addObject("data", data);
		return view;
	}
}
*/
//방법 2 : spring 방법
@Controller
@RequestMapping("login") //타입 레벨 매핑
public class LoginController {
	//메소드 레벨 매핑. 타입 레벨에서 명시했으므로 또 작성안해도 됨
	@RequestMapping(method=RequestMethod.GET) 
	public ModelAndView submit( //메소드 인자에서 변수를 받음.
			@RequestParam(value="id") String id,
			@RequestParam(value="pwd") String pwd) {
		String data = "";
		if(id.equals("aa") && pwd.equals("11")) {
			data = "아자 성공";
		}else {
			data = "ㅠㅠㅠㅠ 실패";
		}
		ModelAndView view = new ModelAndView("list");
		view.addObject("data", data);
		return view;
	}
	}
