import java.util.Scanner;

public class ArratExample2 {

    public static void main(String[] args){

        int even=0,odd=0;
        int evensum=0,oddsum=0;

        Scanner sc=new Scanner(System.in);
        System.out.println("how mwny element do you want in array");
        int n=sc.nextInt();//n=50

        int arr[]=new int[n];

        System.out.println("Enter "+n+" numbet in array\n");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            if(arr[i]%2==0) {
                evensum=evensum+arr[i];
                even++;//2
            }
            else {
                oddsum=oddsum+arr[i];
                odd++;//3
            }
        }
        System.out.println("total even numbers are : "+even+" and sum of total even numbers : "+evensum);
        System.out.println("total odd numbers are : "+odd+" and sum of total odd numbers : "+oddsum);
        
    }
}