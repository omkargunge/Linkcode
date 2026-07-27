package inheritancehirarchical;

public class Main {

	

	    public static void main(String[] args) {

	        Developer dev = new Developer();
	        dev.work();
	        dev.code();

	        System.out.println();

	        Manager mgr = new Manager();
	        mgr.work();
	        mgr.manage();
	    }
	}

