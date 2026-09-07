package fileHandlingCreateGetInfo;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.io.IOException;
import java.io.Writer;


public class WriteCharacter {
	
	public static void main(String[] args) throws IOException{
		
		File file=new File("data.txt");
		
		if(file.exists()) {
			System.out.println("File present");
//			Scanner sc=new Scanner(System.in);
//			System.out.println("Enter data:");
//			String data=sc.nextLine();
//			
//			FileWriter writer=new FileWriter(file);
//			Writer.Writer(data);
//			
//			System.out.println("data written");
//			Writer.close();
			
			FileReader reader=new FileReader(file);
			System.out.println(reader.read());
			
			Scanner sc=new Scanner(file);
			while(sc.hasNext()) {
				System.out.println(sc.next()+" ");
			}
			
			sc.close();
			reader.close();
		}else {
			file.createNewFile();
			System.out.println("file created");
		}
	}

}
