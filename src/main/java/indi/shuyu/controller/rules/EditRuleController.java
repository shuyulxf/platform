package indi.shuyu.controller.rules;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/rules")
public class EditRuleController{
	private Logger logger = LoggerFactory.getLogger(EditRuleController.class); 
	
	
	@RequestMapping(value= "edit", method = RequestMethod.GET)
	public ModelAndView editRule(ModelMap model) {
		
//	   GlobalStaticValues gv = (GlobalStaticValues)SpringContextHelper.getBean("initialization");
//	   Logger logger = gv.logger;
//	   
		logger.info("11");
       ModelAndView mv = new ModelAndView();
       mv.setViewName("rules/editRule"); 
       mv.addObject("message","22"); 
      
       return mv;
       
    }

}
