package array;

public class TwoDArray {

    public static void main(String[] args){

        int mat[][]= {

            {10,20},
            {40,50,60},
            {70},
            {100,110,120,130}
        };

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                System.out.print(mat[i][j]+" ");

            }
            System.out.println();
        }
    }
}