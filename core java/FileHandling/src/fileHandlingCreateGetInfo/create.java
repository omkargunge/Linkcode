package fileHandlingCreateGetInfo;

import java.io.File;
import java.io.IOException;

public class create {

	public static void main(String[] args) throws IOException {
		
		File file=new File("Developmentresume.pdf");
		//file name -by default location
		//absolute path
		if(file.exists()) {
			System.out.println("file is present");
			System.out.println("file name:"+file.getName());
			System.out.println("Absolute path:"+file.getAbsolutePath());
			System.out.println("Length:"+file.length());
			System.out.println("Available space:"+file.getFreeSpace());
			System.out.println("total space:"+file.getTotalSpace());
			
			if(file.canRead()) {
				System.out.println("file is present");
			}
			if (file.canWrite()){
				System.out.println("file is writable");
			}
			if(file.canExecute()) {
				System.out.println("file is executable");
			}
		}else {
			file.createNewFile();
			System.out.println("file created");
		}
		
		
		
	}
}
