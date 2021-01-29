import java.time.LocalDate;

public class Movies implements Comparable<Movies>{
	String name;
	String lang;
	LocalDate releaseDate;
	String director;
	String producer;
	int duration;
	public Movies(String name, String lang, LocalDate releaseDate, String director, String producer, int duration) {
		super();
		this.name = name;
		this.lang = lang;
		this.releaseDate = releaseDate;
		this.director = director;
		this.producer = producer;
		this.duration = duration;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	@Override
	public int compareTo(Movies o) {
		// TODO Auto-generated method stub
		return this.getDirector().compareTo(o.getDirector());
	}
	
}
