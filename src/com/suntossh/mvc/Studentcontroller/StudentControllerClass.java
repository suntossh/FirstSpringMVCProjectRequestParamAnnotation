package com.suntossh.mvc.Studentcontroller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class StudentControllerClass{

	
	@RequestMapping(value="/showLoginPage.html", method=RequestMethod.GET)
	protected ModelAndView showStudentLoginForm() {
		System.out.println("showStudentLoginForm");
		ModelAndView modelAndView = new ModelAndView("StudentLoginPage");
		modelAndView.addObject("messageString", "Welcome to Newyork princeston college, please fill form");
		return modelAndView;
	}

	/*@RequestMapping(value="/submitAdmissionForm.html", method=RequestMethod.POST)
	protected ModelAndView processStudentAdmissionForm(@RequestParam(value="studentName") String name,
														@RequestParam(value="studentHobby") String hobby) {
		System.out.println("@RequestParam String");
		String nameStr = name;
		String hobbyStr = hobby;
		ModelAndView modelAndView = new ModelAndView("AdmissionSuccess");
		modelAndView.addObject("msg", "Welcome to Newyork princeston college "+nameStr+ " Your hobby is "+hobbyStr);
		return modelAndView;
	}*/
	
	@RequestMapping(value="/submitAdmissionForm.html", method=RequestMethod.POST)
	protected ModelAndView processStudentAdmissionForm(@RequestParam() Map<String,String> map) {
		System.out.println("@RequestParam MAP ....");
		String nameStr = map.get("name");
		String hobbyStr = map.get("hobby");
		ModelAndView modelAndView = new ModelAndView("AdmissionSuccess");
		modelAndView.addObject("msg", "Welcome to Newyork princeston college "+nameStr+ " Your hobby is "+hobbyStr);
		return modelAndView;
	}

	
}
