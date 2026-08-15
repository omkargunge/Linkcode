public
package oops.abstraction;

import java.util.Scanner;

public interface Engine {
	public void EngineStart();

	public void EngineStop();

}

public interface Musicsystem {
	public void Music(String song);

	public void MusicOff();

}

public class car implements Engine, Musicsystem {

	private boolean EngineStart = false;
	private boolean MusicOn = false;

	public void MusicOn(String song) {

		if (EngineStart) {
			this.MusicOn = true;
			System.out.println("PLAYING : " + song);
		}
	}

	public void MusicOff() {

		this.MusicOn = false;
		System.out.println("MUSIC STOPPED");

	}

	public void EngineStart() {
		Scanner sc = new Scanner(System.in);
		this.EngineStart = true;
		System.out.println("ENGINE STARTED");
		System.out.println("PLAY MUSIC : ");
		System.out.println("1.YES");
		System.out.println("2.NO");

		int choice = sc.nextInt();
		if (choice == 1) {
			System.out.println("ENTER SONG THE NAME");
			String song = sc.next();
			MusicOn(song);
		}
	}

	public void EngineStop() {
		this.EngineStart = false;
		MusicOff();
		System.out.println("ENGINE STOPPED");
	}

	public class Main {

		public static void main(String[] args) {

			oops.abstraction.car car = new car();

			car.EngineStart();
			car.MusicOn("VANDE MATARAM");
			car.MusicOff();
		}

	}
}
