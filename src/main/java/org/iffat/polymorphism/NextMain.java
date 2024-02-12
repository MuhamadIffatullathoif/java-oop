package org.iffat.polymorphism;

public class NextMain {
    public static void main(String[] args) {
        Movie movie = Movie.getMovie("A", "Star Wars");
        movie.watchMovie();

        Adventure jaws = (Adventure) Movie.getMovie("A", "Star Wars");
        jaws.watchMovie();

        Object comedy = Movie.getMovie("C", "Airplane");
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchComedy();

        var airplane = Movie.getMovie("C", "Airplane");
        airplane.watchMovie();

        var comedyVar = new Comedy("Star Wars");
        comedyVar.watchComedy();
    }
}
