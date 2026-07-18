public class armstrongnumber {
    public static void main(String[] args) {
        int num=153,count=0,temp=num,sum=0;

        while(num>0){
            count++;
            num/=10;

        }
        num=temp;
        while(num>0){
            int digit=num%10;
            int pow=1,a=1;
            while(a<=count){
                pow*=digit;
                a++;
            }
            sum=sum+pow;
            num=num/10;
        }
        System.out.println(temp==sum?"armstrong number":"not armstrong number");
    }
}
