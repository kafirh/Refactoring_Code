package model;

public class Movie {
    private String movieTitle;
    private String movieDate;
    private String movieTime;
    public Movie(String movieTitle, String movieDate, String movieTime) {
        this.movieTitle = movieTitle;
        this.movieDate = movieDate;
        this.movieTime = movieTime;
    }
    public String getMovieTitle() {
        return movieTitle;
    }
    public String getMovieDate() {
        return movieDate;
    }
    public String getMovieTime() {
        return movieTime;
    }
    public void printMovie(){
        System.out.println("Film: " + movieTitle + " pada " + movieDate + " jam " + movieTime);
    }
    public void printMovie(Movie newMovie){
        System.out.println("Film: " + movieTitle);
        System.out.println("Jadwal lama: " + movieDate + " jam " + movieTime);
        System.out.println("Jadwal baru: " + newMovie.movieDate + " jam " + newMovie.movieTime);
    }
}
