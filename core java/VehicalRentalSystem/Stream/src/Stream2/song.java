package Stream2;
//
//public class song {
//
//	private String sname;
//	private String artist;
//	public song(String sname, String artist, String genere, int duraction) {
//		super();
//		this.sname = sname;
//		this.artist = artist;
//		this.genere = genere;
//		this.duraction = duraction;
//	}
//	public String getSname() {
//		return sname;
//	}
//	public void setSname(String sname) {
//		this.sname = sname;
//	}
//	public String getArtist() {
//		return artist;
//	}
//	public void setArtist(String artist) {
//		this.artist = artist;
//	}
//	public String getGenere() {
//		return genere;
//	}
//	public void setGenere(String genere) {
//		this.genere = genere;
//	}
//	public int getDuraction() {
//		return duraction;
//	}
//	public void setDuraction(int duraction) {
//		this.duraction = duraction;
//	}
//	private String genere;
//	private int duraction;
//	
//}


public class song {
	
	private String sname;
	private String genre;
	private String artist;
	private int duration;
	
	public song(String sname, String artist, String genre, int duration) {
		super();
		this.sname = sname;
		this.artist = artist;
		this.genre = genre;
		this.duration = duration;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	

}