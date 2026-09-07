package bookmanagementfilehandlink;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class BookManagement {
	
	static File file=new File("bookData.txt");
	static Scanner sc=new Scanner(System.in);
	
	
	public static void main(String[] args) throws IOException{
		
		boolean flag=true;
		while(flag) {
			
			System.out.println("-----Book Management App-----");
			System.out.println("1.Add Book");
			System.out.println("2.remove Book");
			System.out.println("3.Find Book");
			System.out.println("4.Display All Book");
			System.out.println("5.Update Book Detail");
			System.out.println("-----------------------------");
			System.out.println("Enter your Choice:");
			int ch=sc.nextInt();
			switch(ch) {
			case 1->{
				addBook();
			}
			case 2->{
			    removeBook();
			}
			case 3->{
				findBookById();
			}
			case 4->{
				findAllBooks();
			}
			case 5 -> {
			    updateBook();
			}
			
			default->System.out.println("Invalid Choice");
			}
			
			}
		}
	
	
		private static void updateBook() throws IOException {

		    System.out.println("Enter Book Id to update:");
		    int id = sc.nextInt();

		    Scanner scanner = new Scanner(file);

		    File tempFile = new File("tempData.txt");

		    FileWriter writer = new FileWriter(tempFile);

		    boolean found = false;

		    while (scanner.hasNextLine()) {

		        String line = scanner.nextLine();

		        String data[] = line.split(",");

		        String idData[] = data[0].split("=");

		        int bookId = Integer.parseInt(idData[1]);

		        if (bookId == id) {

		            found = true;

		            System.out.println("Enter New Book Name:");
		            String name = sc.next();

		            System.out.println("Enter New Book Author:");
		            String author = sc.next();

		            System.out.println("Enter New Book Price:");
		            double price = sc.nextDouble();

		            Book book = new Book(id, name, author, price);

		            writer.write(book.toString() + "\n");

		        } else {

		            writer.write(line + "\n");
		        }
		    }

		    scanner.close();
		    writer.close();

		    if (found) {

		        file.delete();

		        tempFile.renameTo(file);

		        System.out.println("Book updated successfully!");

		    } else {

		        tempFile.delete();

		        System.out.println("Book not present!");
		    }
		}
	

	private static void removeBook() throws FileNotFoundException, IOException {
		System.out.println("Enter Book Id:");
		int id=sc.nextInt();
		
		//scanner---4line get
		Scanner scanner=new Scanner(file);
		FileWriter writer=new FileWriter("tempData.txt");
		
		while(scanner.hasNextLine()) {
			String line=scanner.nextLine();
			String data[]=line.split(",");
			
			
			String iddata[]=data[0].split("=");
			if(Integer.parseInt(iddata[1])==id) {
			continue;
			}
			
			writer.write(line+"\n");
		}
		writer.close();
		scanner.close();
		System.out.println("Book not present");
		
		
		
	    
	}

	private static void findBookById() throws FileNotFoundException {
		System.out.println("Enter Book Id:");
		int id=sc.nextInt();
		
		//scanner---4line get
		Scanner scanner=new Scanner(file);
		
		
		while(scanner.hasNextLine()) {
			String data[]=scanner.nextLine().split(",");
			
			//[ id=1.name=abc,author=abc,price=400]
			//    0     1          2        3
			
			String iddata[]=data[0].split("=");//id=1--[id,"1"]
			if(Integer.parseInt(iddata[1])==id) {
			System.out.println(Arrays.toString(data));
			return;
			}
		}
		
		scanner.close();
		System.out.println("Book not present");
		
		
	}

	private static void findAllBooks() throws FileNotFoundException {
		Scanner scanner=new Scanner(file);
		
		System.out.println("-----Book Details-----");
		while(scanner.hasNextLine()) {
			System.out.println(scanner.nextLine());
		}
		System.out.println("----------------------");
		scanner.close();
		
	}

	private static void addBook() throws IOException{
		System.out.println("Enter book id:");
		int id=sc.nextInt();
		
		System.out.println("Enter book Name:");
		String name=sc.next();
		
		System.out.println("Enter book Author:");
		String author=sc.next();
		
		System.out.println("Enter book price:");
		double price=sc.nextDouble();
		
		Book book=new Book(id,name,author,price);
		
		FileWriter writer=new FileWriter(file,true);
		writer.write(book.toString()+"\n");
		System.out.println("book added");
		writer.close();
	}

}
