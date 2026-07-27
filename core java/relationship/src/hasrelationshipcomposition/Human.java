package hasrelationshipcomposition;

public class Human {
	Heart heart;
	public Human() {
		heart=new Heart();
	}
	
	public void alive() {
		System.out.println("human is alive");
	}
}
