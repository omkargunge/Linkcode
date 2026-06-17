import java.util.*;
class str{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);

        //sc.nextline();

        System.out.println("enter one string");
        String str=sc.nextLine();

        String remove="";

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(remove.indexOf(ch)==-1){
                remove+=ch;
            }

        }
        System.out.println("after removing duplicate charchter " +remove);
    }

}