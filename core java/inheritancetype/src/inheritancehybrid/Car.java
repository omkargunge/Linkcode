package inheritancehybrid;

public class Car extends Vehical implements Eletric {

    public void drive() {
        System.out.println("Car is driving");
    }

    @Override
    public void charge() {
        System.out.println("Battery is charging");
    }
}
