package examplenotify;

public class Main {

	public static void main(String[] args) {
		
		Pizza pizza=new Pizza();
		
		Pizzahut pizzahut=new Pizzahut(pizza);
		Friends friends=new Friends(pizza);
		
		pizzahut.start();
		friends.start();
		
	}
}
