import java.util.Scanner;

public class ArrayOperation {

    public int create(int barr[]) {

        Scanner sc=new Scanner(System.in);
        System.out.println("how many number do you want in arrya");
        int n=sc.nextInt();//n=5
        System.out.println("enter "+n+" number in array");
        for(int i=0;i<n;i++){
            barr[i]=sc.nextInt();
        }
        return n;
    }
    public void display(int arr[],int n) {

        for(int i=0;i<n;i++) {
            System.out.println(arr[i]);
 
        }
    }

    public boolean search(int arr[],int n,int search) {

        boolean b=false;
        for(int i=0;i<n;i++){
            if(arr[i]==search){
                b=true;
                break;
            }
        }
        return b;

    }

    public void sort(int arr[],int n){
        int temp;
        //sorting......
        for(int i=0;i<n;i++){//3<5
            for(int j=i+1;j<n;j++){//j=2<5
                if(arr[i]>arr[j]) {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }
        }
    }

    public int insert(int arr[],int n,int loc,int newvalue){

        for(int i=n;i>=loc-1;i--) {//1>=2
            arr[i+1]=arr[i];

        }
        arr[loc-1]=newvalue;
        n++;//n=6
        return n;

    }
    public void delete(){
        
    }

}