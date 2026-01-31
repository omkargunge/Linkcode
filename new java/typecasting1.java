class typecasting1{
    public static void main(String[] args){

        int a=78;
        long b=90;
        //widening -small to long
        long c=a;
        //narrowing -- long to small
        //int d=b; --- error
        int d=(int)b;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }
}