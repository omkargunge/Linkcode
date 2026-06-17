// import java.util.*;
// class count {

//     public static void main(String[] args) {
    

//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter One Sentemce:");
//         String str=sc.nextLine();// how ate you
//         StringBuffer rev=new StringBuffer(str);
//         rev.reverse();
//         String count[]=str.split(" ");
//         System.out.println(Arrays.toString(count));
//         System.out.println("reverse words: "+rev);
//         System.out.println("count of words:"+count.length); 


//     }
// }
import java.util.*;
class strreverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter One Sentence:");
        String str = sc.nextLine();
        StringBuffer rev = new StringBuffer(str);
        rev.reverse();
        String count[] = str.split(" ");
        String rev="";
        for(String word:count){
            for(int i=word.length()-1;i>=0;i--)
            rev+=word.charAt(i);
        }
        rev+=" ";
        
        System.out.println("reverse words: " + rev);
        
    
    }
}

    

