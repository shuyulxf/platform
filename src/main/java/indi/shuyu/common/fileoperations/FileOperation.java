package indi.shuyu.common.fileoperations;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class FileOperation {
	
	public static BufferedReader readFileToMemoryUseClassPath(String dataFilePath) throws FileNotFoundException, IOException {
		
		Resource resource = new ClassPathResource(dataFilePath);
		FileReader fr = new FileReader(resource.getFile());
		
		return new BufferedReader(fr);
	}
	
	public static void closeBufferReader(BufferedReader br) throws IOException {
		br.close();
	}
}
