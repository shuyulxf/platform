package indi.shuyu.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Controller
@RequestMapping("/rules")
public class EditRuleController {
	
	private static final Logger logger = LoggerFactory.getLogger(EditRuleController.class);
	
	@RequestMapping("edit")
	public ModelAndView printHello(ModelMap model) {
       
       ModelAndView mv = new ModelAndView();
       
       mv.setViewName("rules/editRule"); 
       mv.addObject("message","2");
       logger.info("Hello {}","EditRuleController");
       return mv;
    }
	
	@RequestMapping("edit1")
	public String edit(Model model) {
		model.addAttribute("message", "3");
		
		return "rules/editRule";
	}
	
}
