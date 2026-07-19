import java.util.Scanner;
public class array2d2 {
    
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter row no:");
        int row=sc.nextInt();
        System.out.println("enter col no:");
        int col=sc.nextInt();
        int arr[][]=new int[row][col];

        // for(int i=0;i<row;i++){
        // System.out.println("enter value for row"+(i+1));
        //     for(int j=0;j<col;j++){
        //         arr[i][j]=sc.nextInt;

        //     }
        //   
        // }
        for(int a[]:arr){
            for(int b:a){
                System.out.print(b+" ");
            }
            System.out.println();
        }
    }
}




