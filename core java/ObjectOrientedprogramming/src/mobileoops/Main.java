package mobileoops;

public class Main {
	public static void main(String[] args) {
        Mobile mobile1 = new Mobile("samsung", "blue", 50000, 50, 256);
        System.out.println(mobile1.cname);

        Mobile mobile2 = new Mobile("iphone", "orange", 50000, 50, 256);
        System.out.println(mobile2.cname);

        Mobile mobile3 = new Mobile("vivo", "blue", 50000, 50, 256);
        System.out.println(mobile3.cname);

        Mobile mobile4 = new Mobile("oneplus", "grey", 50000, 50, 256);
        System.out.println(mobile4.cname);
    }
}
