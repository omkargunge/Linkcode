package interface1;

public class Main {

	public static void main(String[] args) {
		Notification notification=new EmailNotification();
		Notification notification2=new SMSNotification();
		notification.notification();
		notification2.notification();
	}
}
