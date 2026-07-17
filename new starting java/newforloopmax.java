public class newforloopmax {
    
    public static void main(String[]args){

        int arr[]={12,3,45,6,7};
        int max=arr[0];

        for(int i:arr){
            if(max<i){
                max=i;
            }
        }
        System.out.println(max);
    }
}


