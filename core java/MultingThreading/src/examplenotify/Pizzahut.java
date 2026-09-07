package examplenotify;

public class Pizzahut extends Thread{

	Pizza pizza;
	
	public Pizzahut(Pizza pizza) {
		this.pizza=pizza;
	}
	
	@Override
	
	public void run() {
		pizza.makePizza(15);
	}
	
	
	
}
