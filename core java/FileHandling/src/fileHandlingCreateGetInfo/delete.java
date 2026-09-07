package fileHandlingCreateGetInfo;

import java.io.File;

public class delete {

	public static void main(String[] args) {
		
		File file=new File("Developmentresume.pdf");
		
		if(file.exists()) {
			file.delete();
			System.out.println("file deleted");
		}else {
			System.out.println("file does not exit");
		}
	}
}
