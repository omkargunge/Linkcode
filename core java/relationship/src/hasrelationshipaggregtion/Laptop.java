package hasrelationshipaggregtion;

public class Laptop {

	private String cname;
    private int ram;
    private double price;

    public Laptop(String cname, int ram, double price) {
        this.cname = cname;
        this.ram = ram;
        this.price = price;
    }

    public void start() {
        System.out.println(this.cname + " laptop on");
    }
}
