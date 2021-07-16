package Comparator;
import java.util.*;


class Movie implements Comparable<Movie>{

	private double rating;
	private String name;
	private int year;
	
	@Override
	public int compareTo(Movie o) {
		return this.year-o.year;
	}
	public Movie(String name,double rr,int yy) {
		this.name = name;
		this.year= yy;
		this.rating=rr;
	}
	
	public double getRating() {
		return rating;
	}
	public String getName() {
		return name;
	}
	public int getYear() {
		return year;
	}
}



class MovieComparable {

	public static void main(String[] args) {
		List<Movie> lt = new ArrayList<>();
		lt.add(new Movie("Bahubali",9.3,2015));
		lt.add(new Movie("Star wars",9.4,1977));
		lt.add(new Movie("Mr and Mr's smith",8.5,2008));
		lt.add(new Movie("End game",8.7,2020));

		Collections.sort(lt);
		System.out.println("MOVIES ARE SORTING");
		for(Movie m : lt) {
			System.out.println(m.getName()+" "+m.getRating()+" "+m.getYear());
		}
	}

}
