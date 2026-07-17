public class forloopmax {
    public static void main(String[]args){

        int arr[]={12,3,45,6,7};
        int max=arr[0];

        for(int i=0;i<5;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
