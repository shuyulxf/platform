package indi.shuyu.handle.exception;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ErrorPageController {
	
	 @RequestMapping(value = "error", method = RequestMethod.GET)
	public ModelAndView printHello(ModelMap model) {
       
       ModelAndView mv = new ModelAndView();
       
       mv.setViewName(""); 
       mv.addObject("message","22");
       
       return mv;
    }
}
