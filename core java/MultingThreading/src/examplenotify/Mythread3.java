package examplenotify;

public class Mythread3 extends Thread{

	
	@Override
	public void run() {
		String name="hellow omkar";
				
				for(int i=0;i<name.length();i++) {
					System.out.println(name.charAt(i));
					
					
				}
				try {
					this.sleep(5000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
	}
}
