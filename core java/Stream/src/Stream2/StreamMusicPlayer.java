package Stream2;
//
//import java.util.Scanner;
//
//public class StreamMusicPlayer {
//	 static Scanner sc=new Scanner(System.in);
//	 static Playlist playlist;
//	 public static void main(String[] args) {
//		
//		
//		System.out.println("---music player-------");
//		System.out.println("1.add play list");
//		System.out.println("2.add song");
//		System.out.println("3.display song");
//		System.out.println("4.remove song");
//		System.out.println("5.rename play li");
//		System.out.println("6.filter by gener");
//		System.out.println("7.filter by artist");
//		System.out.println("8.filter by song name");
//		System.out.println("9.sort by song name");
//		System.out.println("10.shuffle playlist");
//		System.out.println("enter youe choice:");
//		int ch=sc.nextInt();
//		switch(ch) {
//		case 1->{
//			System.out.println("enter playlist name:");
//			String pname=sc.next();
//			playlist=new Playlist(pname);
//			System.out.println("playlist created");
//		}
//		case 2->{
//			System.out.println("enter song name:");
//			String sname=sc.next();
//			System.out.println("enter artist name:");
//			String artist=sc.next();
//			System.out.println("enter gener");
//			String gener=sc.next();
//			System.out.println("enter duraction");
//			int duraction=sc.nextInt();
//			Song song=new Song(sname,artist,gener,duraction);
//			playlist.addSong(song);
//				
//				
//		}
//		
//		}
//		
//	}
//}


import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StreamMusicPlayer {
	static Scanner sc = new Scanner(System.in);
	static Playlist playlist;
	
	public static void main(String[] args) {
		boolean flag = true;
		while(flag) {
			
			System.out.println("=====Music Player=====");
			System.out.println("1. Add Playlist");
			System.out.println("2. Add Song");
			System.out.println("3. Display Songs");
			System.out.println("4. Remove Song");
			System.out.println("5. Rename Playlist");
			System.out.println("6. Filter by Genre");
			System.out.println("7. Filter by Artist");
			System.out.println("8. Search by Song Name");
			System.out.println("9. Sort by Song Name");
			System.out.println("10. Shuffle Playlist");
			System.out.println("11. Exit");
			
			System.out.println("Enter a choice");
			int ch = sc.nextInt();
			
			switch(ch) {
			case 1 ->{
				System.out.println("Enter Playlist Name");
				sc.nextLine();
				String pname = sc.nextLine();
				playlist = new Playlist(pname);
				initializeSongs();
				System.out.println("Playlist Created!");
			}
			case 2 -> {
			    if (playlist == null) {
			        System.out.println("Please create a playlist first!");
			        break;
			    }

			    System.out.println("Enter a Song Name");
			    sc.nextLine();
			    String sname = sc.nextLine();

			    System.out.println("Enter Artist Name");
			    String artist = sc.nextLine();

			    System.out.println("Enter Genre");
			    String genre = sc.next();

			    System.out.println("Enter Duration");
			    int duration = sc.nextInt();

			    song song = new song(sname, artist, genre, duration);
			    playlist.addSong(song);
			}
			case 3 ->{
				if (playlist == null) {
			        System.out.println("Please create a playlist first!");
			        break;
			    }
				System.out.println("=====Song List=====");
				playlist.getSongs().forEach(val->System.out.println(val.getSname() + "||" + val.getArtist() + "||" + val.getGenre() + "||" + val.getDuration()));
				System.out.println("===================");
			}
			case 4 -> {
			    if (playlist == null) {
			        System.out.println("Please create a playlist first!");
			        break;
			    }

			    System.out.println("Enter Song Name to Remove");
			    sc.nextLine();
			    String songName = sc.nextLine();

			    boolean removed = playlist.removeSong(songName);

			    if (removed) {
			        System.out.println("Song Removed!");
			    } else {
			        System.out.println("Song Not Found!");
			    }
			}
			case 5 -> {
			    if (playlist == null) {
			        System.out.println("Please create a playlist first!");
			        break;
			    }

			    System.out.println("Enter New Playlist Name");
			    sc.nextLine();
			    String newName = sc.nextLine();

			    playlist.setPname(newName);

			    System.out.println("Playlist Renamed Successfully!");
			    System.out.println("New Playlist Name: " + playlist.getPname());
			}
			case 6 -> {
			    if (playlist == null) {
			        System.out.println("Please create a playlist first!");
			        break;
			    }

			    System.out.println("Enter Genre");
			    sc.nextLine();
			    String genre = sc.nextLine();

			    List<song> filtered = playlist.filterByGenre(genre);

			    System.out.println("=====Song List=====");

			    if (filtered.isEmpty()) {
			        System.out.println("No songs found for genre: " + genre);
			    } else {
			        filtered.forEach(val -> System.out.println(val.getSname() + "||" + val.getArtist() + "||" + val.getGenre() + "||" + val.getDuration()));
			    }

			    System.out.println("===================");
			}
			case 7 ->{
				if (playlist == null) {
				    System.out.println("Please create a playlist first!");
				    break;
				}
				System.out.println("Enter a Artist Name");
				sc.nextLine();
				String artist = sc.nextLine();
				List<song> filtered = playlist.filterByArtist(artist);
				System.out.println("=====Song List=====");
				filtered.forEach(val->System.out.println(val.getSname() + "||" + val.getArtist() + "||" + val.getGenre() + "||" + val.getDuration()));
				System.out.println("===================");
			}
			case 9->{
				Playlist.sortBySongName();
				System.out.println("song sorted by song name");
			}
			case 10->{
				List<song> songs=playlist.getSongs();
				Collections.shuffle(songs);
			}
			case 11 -> {
			    flag = false;
			    System.out.println("Exiting Music Player...");
			}
			}
			
		}
	}

	private static void initializeSongs() {
		playlist.addSong(new song("vaste", "mahesh", "pop", 7));
		playlist.addSong(new song("kesariya", "arjit", "romance", 8));
		playlist.addSong(new song("palpal", "kk", "abc", 6));
		playlist.addSong(new song("mahi", "arjit", "romance", 5));
		
	}

}