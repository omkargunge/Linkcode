package ByteStrimg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Bytestring1 {

	public static void main(String[] args) throws IOException {
		
		File file=new File("data.txt");
		
		if(file.exists()) {
			System.out.println("file present");
			
//			FileOutputStream outputStream=new FileOutputStream(file);
//			outputStream.write(244);
//			System.out.println("byte data written");
//			outputStream.close();
			
			FileInputStream inputStream=new FileInputStream(file);
			System.out.println(inputStream.read());
			inputStream.close();
			
		}else {
			System.out.println("File not present!!!!");
		}
	}
}
