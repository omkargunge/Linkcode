import java.util.*;
class count {

    public static void main(String[] args) {
        //WAP to count the words in given String
        //how are you -word-3

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter One Sentemce:");
        String str=sc.nextLine();// how ate you
        String count[]=str.split(" ");
        System.out.println(Arrays.toString(count));
        System.out.println("count of words:"+count.length);


    }
}
    

