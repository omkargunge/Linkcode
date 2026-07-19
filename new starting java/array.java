import java.util.*;
public class array{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length for array");

        int len=sc.nextInt();
        int arr[]=new int[len];
        System.out.println("enter values for an array");

        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }

        for(int a:arr){
            System.out.println(a);
        }

    }
}