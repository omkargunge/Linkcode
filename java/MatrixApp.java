package array;

import java.util.Scanner;
public class MatrixApp {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("how many row do you want in matrix 1");
        int r1=sc.nextInt();

        int mat1[][]=new int[r1][];//r1=4

        System.out.println("enter col for each row of matrix");
        //memory allocated.....

        for(int i=0;i<mat1.length;i++){ //i=3<4
        System.out.println("enter col for "+(i+1)+" row");
        int c=sc.nextInt();//2 3 4 1
        mat1[i]=new int[c];

        }
        //enter element in matrix1

        System.out.println("enter element in matrix");
        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1[i].length;j++){

                mat1[i][j]=sc.nextInt();
            }
        }
        System.out.println("\n----------Matrix1-----------");
        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1[i].length;j++) {

                System.out.print(mat1[i][j]+" ");
            }
            System.out.println();
        }

    }
}