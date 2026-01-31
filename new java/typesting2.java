public class typesting2 {
    public static void main(String[] args) {
        
        char x='o';
        
        
        //widening
        int a=x;
        System.out.println(a);
        //widening
        float b=x;
        System.out.println(b);
        //narrowing
        byte c=(byte)x;
        System.out.println(c);


            double marks=78.90;
            //all are narrowing
            long l=(long)marks;
            System.out.println(l);

            int i=(int)marks;
            System.out.println(i);

            char ch=(char)marks;
            System.out.println(ch);

             




        

    }
    
}
