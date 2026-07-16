import java.util.*;
public class elseifladder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter your marks");
        int marks=sc.nextInt();

        if(marks>85){
            System.out.println("A");
        }else if(marks>75){
            System.out.println("B");
        }else if(marks>65){
            System.out.println("C");
        }else if(marks>35){
            System.out.println("D");
        }
        else{
            System.out.println("Fail");
        }
    }
}
