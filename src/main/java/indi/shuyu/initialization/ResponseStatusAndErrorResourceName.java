package indi.shuyu.initialization;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;

import indi.shuyu.common.fileoperations.FileOperation;

public class ResponseStatusAndErrorResourceName {
	
	private HashMap<String, String> datas = null;
	private String dataFilePath = "datas/responseStatusAndErrorResourceNameMap.properties";
	
	public ResponseStatusAndErrorResourceName() throws IOException {
		
		readFileToMap(FileOperation.readFileToMemoryUseClassPath(dataFilePath));
	}

	private void readFileToMap(BufferedReader br) throws IOException {
		
		datas = new HashMap<String, String>();
		
		String readLine = "";
		
		while ((readLine = br.readLine()) != null) {
            
			String[] keyAndValueArr = readLine.split(" ");
			
			if (keyAndValueArr != null && keyAndValueArr.length == 2) {
				datas.put(keyAndValueArr[0], keyAndValueArr[1]);
			}
        }
	} 
	
	public HashMap<String, String> getRSRN() {
		return datas;
	}
}
