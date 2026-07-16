import java.util.*;
public class nestedvowel {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter one character");
        char ch=sc.next().charAt(0);

        if(ch>='A'&&ch<='Z'){

            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                System.out.println("vowel character");
            }else{
                System.out.println("consonsnt character");
            }
            
        }else{
            System.out.println("lower case character");
        }
    }
    
    
}


