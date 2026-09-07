package examplenotify;

public class Pizza {
	
	int noOfpizza=0;
	
	public synchronized void orderPizza(int no) {
		System.out.println("order confirmed");
		System.out.println("orderning"+no+"pizzas......");
		if(noOfpizza<no) {
			System.out.println("we are making your pizzas please wait...");
			
			try {
				this.wait();
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			
				
			
		}
		noOfpizza-=no;
		System.out.println("order delivered");
		
	}

	public synchronized void makePizza(int no) {
		System.out.println("making"+no+"pizzas");
		noOfpizza+=no;
		this.notify();
		
	}

	

}
