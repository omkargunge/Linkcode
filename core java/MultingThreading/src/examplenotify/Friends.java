package examplenotify;

public class Friends extends Thread{

	Pizza pizza;
	
	public Friends(Pizza pizza) {
		this.pizza=pizza;
		
	}
	@Override
	public void run() {
		pizza.orderPizza(15);
	}
}
