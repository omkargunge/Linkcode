public class array2denhanceloop {
    
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};

        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr.length;j++){
        //         System.out.print(arr[i][j]+" ");;

        //     }
        //     System.out.println();
        // }
        for(int a[]:arr){
            for(int b:a){
                System.out.print(b);
            }
            System.out.println();
        }
    }
}


