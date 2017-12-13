package indi.shuyu.initialization;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;


@Component
public class GlobalStaticValues implements InitializingBean  {
	
	private Logger logger = null;
	private HashMap<String, String> responseStatusAndErrorResourceMap = null;
	
	@Override
	public void afterPropertiesSet() throws Exception {
		logger = LoggerFactory.getLogger(GlobalStaticValues.class); 
		
		/* http response error status to error pages*/
		ResponseStatusAndErrorResourceName rs = new ResponseStatusAndErrorResourceName();
		responseStatusAndErrorResourceMap = rs.getRSRN();
	}
	 
	public Logger getLogger() {
		return logger;
	}
	
	public String getResponseStatusAndErrorResource(String key) {
		
		if (key == null || key.length() <= 0)  key = "error";
		return responseStatusAndErrorResourceMap.get(key);
	}
	
	public String getResponseStatusAndErrorResource() {
		
		return responseStatusAndErrorResourceMap.get("error");
	}
}
