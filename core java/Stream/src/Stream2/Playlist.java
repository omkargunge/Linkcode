package Stream2;
//
//import java.util.ArrayList;
//
//public class Playlist {
//	
//	private String pname;
//	ArrayList <song>song=new ArrayList<song>();
//
//	public Playlist(String pname) {
//		super();
//		this.pname = pname;
//	}
//	public void addSong(Song song) {
//		song.add(song);
//	System.out.println("song added");
//	}
//	public void setSong(ArrayList<Song> songs) {
//		this.song Songs(songs);
//	}
//	public List<Song> filterByArtist(String art){
//		return songs
//		.stream()
//		.filter
//	}
//	
//}


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Playlist {
	
	private String pname;
	private static ArrayList<song> songs = new ArrayList<>();
	
	public Playlist(String pname) {
		super();
		this.pname = pname;
	}
	
	public void addSong(song song){
		songs.add(song);
		System.out.println("Song Added!");
	}
	
	public List<song> filterByArtist(String art){
		return songs.stream().filter(song -> song.getArtist().equalsIgnoreCase(art)).collect(Collectors.toList());
	}
	
	public List<song> filterByGenre(String genre) {
	    return songs.stream().filter(song -> song.getGenre().equalsIgnoreCase(genre)).collect(Collectors.toList());
	}
	
	public String getPname() {
		return pname;
	}
	
	public void setPname(String pname) {
		this.pname = pname;
	}

	public ArrayList<song> getSongs() {
		return songs;
	}
	
	public boolean removeSong(String songName) {
	    return songs.removeIf(song -> song.getSname().equalsIgnoreCase(songName));
	}

	public static void sortBySongName() {
		songs.sort((s1,s2)->
		s1.getSname().
		compareToIgnoreCase(s2.getSname()));
		
	}
	

}