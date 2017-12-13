package indi.shuyu.common.http;

import javax.servlet.http.HttpServletRequest;

public class SpringHttpHelper {
	
	public boolean isAjax(HttpServletRequest request) {
		
		if (request.getHeader("accept") != null && 
			request.getHeader("accept").indexOf("application/jsfon") != -1 ||
		    request.getHeader("X-Requested-With") != null && 
		    request.getHeader("X-Requested-With").indexOf("XMLHttpRequest") != -1)
			return true;
		
		return false;
	}
}
