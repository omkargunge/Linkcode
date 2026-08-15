package treeset1;

import java.time.LocalDateTime;
import java.util.TreeSet;

public class meetingShedule {

	static TreeSet<LocalDateTime> meetings =new TreeSet<LocalDateTime>();
	
	public static void main(String[] args) {
		sheduleMeeting(LocalDateTime.of(2026,8,7,11,45));
		sheduleMeeting(LocalDateTime.of(2026,8,7,8,30));
		sheduleMeeting(LocalDateTime.of(2026,8,7,8,30));
		sheduleMeeting(LocalDateTime.of(2026,8,7,10,0));
		System.out.println(meetings);
		System.out.println(meetings.getFirst());
		System.out.println(meetings.getLast());
		//7-8-2026 11.45 8.30 10.0
	}

	private static void sheduleMeeting(LocalDateTime localDateTime) {
		meetings.add(localDateTime);
		
	}
}
