public class whilelooptable20 {
     public static void main(String[]args){
    int i=1;
    while(i<=20){
        System.out.println("table of" +i);
        int j=1;
        while(j<=10){
            System.out.println(i+"*"+j+"="+(i*j));
            j++;

        }
        System.out.println();
        i++;
    }
}
}
