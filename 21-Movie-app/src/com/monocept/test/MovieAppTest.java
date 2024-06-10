package com.monocept.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

import com.monocept.model.Movie;
import com.monocept.exceptions.CapacityFullException;
import com.monocept.exceptions.NoSuchMovieFoundException;

public class MovieAppTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        Movie[] movies = new Movie[5];
        int movieCount = 0;

        try {
            FileInputStream fileIn = new FileInputStream("D:\\assignments\\21-Movie-app\\src\\com\\monocept\\test\\MovieList.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Movie[] loadedMovies = (Movie[]) in.readObject();
            for (int i = 0; i < loadedMovies.length; i++) {
                if (loadedMovies[i] != null) {
                    movies[i] = loadedMovies[i];
                    movieCount++;
                }
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("No saved movies found, starting fresh.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        boolean exit = false;
        while (!exit) {
            System.out.println("Enter your option : \n 1. Display movies \n 2. Add movie \n 3. Display required movie \n 4. Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    displayMovies(movies);
                    break;
                case 2:
                    try {
                        addMovie(movies, scanner, movieCount);
                        movieCount++;
                    } catch (CapacityFullException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                      try {
                    displayMovieById(movies, scanner);
                      }
                      catch(NoSuchMovieFoundException e) {
                    	  System.out.println(e.giveMessage());
                      }
                    break;
                case 4:
                    exit = true;
                    System.out.println("Thank you!!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addMovie(Movie[] movies, Scanner scanner, int movieCount) {
        if (movieCount >= 5) {
            throw new CapacityFullException();
        }
        Movie movie = new Movie();
        System.out.println("Enter movie id:");
        movie.setMovieid(scanner.nextInt());
        System.out.println("Enter movie name:");
        movie.setName(scanner.next());
        System.out.println("Enter genre:");
        movie.setGenre(scanner.next());
        System.out.println("Enter year:");
        movie.setYear(scanner.nextInt());
        movies[movieCount] = movie;
    }

    private static void displayMovies(Movie[] movies) {
        for (Movie movie : movies) {
            if (movie != null) {
                movieDisplay(movie);
            }
        }
    }

    private static void displayMovieById(Movie[] movies, Scanner scanner) {
        System.out.println("Enter movie id:");
        int id = scanner.nextInt();
        for (Movie movie : movies) {
            if (movie != null && movie.getMovieid() == id) {
                movieDisplay(movie);
               return;
            }
        }
        throw new NoSuchMovieFoundException();
    }

    private static void movieDisplay(Movie movie) {
        System.out.println("Movie ID: " + movie.getMovieid());
        System.out.println("Name: " + movie.getName());
        System.out.println("Genre: " + movie.getGenre());
        System.out.println("Year: " + movie.getYear());
        System.out.println();
    }
}
