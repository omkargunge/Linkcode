import java.util.*;
public class jaggedarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the row length;");
        int row=sc.nextInt();

        int arr[][]=new int[row][];
        for(int i=0;i<arr.length;i++){
            System.out.println("enter the row"+(i+1)+"col length");
            int col=sc.nextInt();
            arr[i]=new int[col];
        }
        System.out.println("enter the values");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        //print sathiloop

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println(arr[i][j]+" ");

            }
            System.out.println();
        }


    }
    
}
