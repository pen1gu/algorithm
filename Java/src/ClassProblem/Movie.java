package ClassProblem;

public class Movie {
	private String movie_name;
	private double grade;
	private String director;

	public Movie(String movie_name, double grade, String director) {
		this.movie_name = movie_name;
		this.grade = grade;
		this.director = director;
	}

	void print() {
		System.out.printf("영화의 이름은 %s이고 평점은 %s이며 감독의 이름은 %s입니다.", movie_name, grade, director);
	}
}
