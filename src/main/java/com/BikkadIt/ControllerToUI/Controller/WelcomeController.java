package com.BikkadIt.ControllerToUI.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	
    @GetMapping("/WelMsg")
	public ModelAndView WelcomeMsg() {
		
		String Msg="Welcome to Thorat Family";
		
		ModelAndView mav= new ModelAndView();//return type is model&view so we create model & view object
		mav.addObject("message", Msg);
		mav.setViewName("wel");//we can set name to rendering data from ui
		
		return mav;
		
	}
	
}
