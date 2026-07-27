package mobilescanner;

public class Mobile {


	

		String cname;
		String color;
		double price;
		int cam;
		int storage;
		
		public Mobile(String cname,String color,double price,int cam,int storage) {
			this.cname=cname;
			this.color=color;
			this.price=price;
			this.cam=cam;
			this.storage=storage;
		}
		public void call() {
			System.out.println("user for calling");
		}
		public void message() {
			System.out.println("user for messaging");
		}
	

}
