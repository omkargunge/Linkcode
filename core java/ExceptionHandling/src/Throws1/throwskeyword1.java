package Throws1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class throwskeyword1 {
	
	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream inputStream=new FileInputStream("resume.pdf");
		
		System.out.println("exception handle");
	}
	
}
