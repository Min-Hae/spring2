package aa.bb.good;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

//���1 : �������� ���
/*
@Controller
public class LoginController {
	@RequestMapping(value="login", method=RequestMethod.GET)
	public ModelAndView submit(HttpServletRequest request) {
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		String data = "";
		if(id.equals("aa") && pwd.equals("11")) {
			data = "�Ϳ� ����";
		}else {
			data = "�Ф� ����";
		}
		ModelAndView view = new ModelAndView("list");
		view.addObject("data", data);
		return view;
	}
}
*/
//��� 2 : spring ���
@Controller
@RequestMapping("login") //Ÿ�� ���� ����
public class LoginController {
	//�޼ҵ� ���� ����. Ÿ�� �������� ��������Ƿ� �� �ۼ����ص� ��
	@RequestMapping(method=RequestMethod.GET) 
	public ModelAndView submit( //�޼ҵ� ���ڿ��� ������ ����.
			@RequestParam(value="id") String id,
			@RequestParam(value="pwd") String pwd) {
		String data = "";
		if(id.equals("aa") && pwd.equals("11")) {
			data = "���� ����";
		}else {
			data = "�ФФФ� ����";
		}
		ModelAndView view = new ModelAndView("list");
		view.addObject("data", data);
		return view;
	}
	}
