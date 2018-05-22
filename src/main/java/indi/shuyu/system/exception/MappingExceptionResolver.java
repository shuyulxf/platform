package indi.shuyu.system.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.NestedServletException;

import indi.shuyu.common.base.SpringContextHelper;
import indi.shuyu.common.http.SpringHttpHelper;
import indi.shuyu.initialization.GlobalStaticValues;

public class MappingExceptionResolver implements HandlerExceptionResolver{
	
	private final static Logger logger = LoggerFactory.getLogger(MappingExceptionResolver.class);
	private final String errorType500 = "500";
	
	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) {
		
		GlobalStaticValues GSVS = (GlobalStaticValues)SpringContextHelper.getApplicationContext().getBean("initialization"); 
		ModelAndView mv = null;
		String errorPagePath = "";
		
		try {
			SpringHttpHelper ajaxHelper = (SpringHttpHelper)SpringContextHelper.getBean("httpHelper");
			boolean isAjax = ajaxHelper.isAjax(request);
			
			logger.error(ex.getMessage());
			
			if (!isAjax) {
				
				if (ex instanceof NestedServletException) {
					errorPagePath = GSVS.getResponseStatusAndErrorResource(errorType500);
				}
				
				mv = new ModelAndView(errorPagePath);
			}
		} catch(Exception  e) {
			mv = new ModelAndView(GSVS.getResponseStatusAndErrorResource());
		}
		
	    return mv;
	}
	
	

}
