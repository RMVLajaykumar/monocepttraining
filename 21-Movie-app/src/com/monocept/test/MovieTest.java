package com.monocept.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import com.monocept.model.Movie;

public class MovieTest {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Movie[] movies = new Movie[5];
        boolean exit = false;
        int movieCount = 0;
        while (!exit) {
            System.out.println("Enter: \n 1. Add movie \n 2. Display movies \n 3. Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    if (movieCount < movies.length) {
                        movies[movieCount] = new Movie();
                        addMovie(movies[movieCount], scanner);
                        movieCount++;
                    }
                    break;
                case 2:
                    displayMovies(movies);
                    break;
                case 3:
                    exit = true;
                    System.out.println("thankyou");
                    break;
                    
                    
                    
              
            }
        }
        
        try {
			
        	FileOutputStream object1=new FileOutputStream("D:\\assignments\\21-Movie-app\\src\\com\\monocept\\test\\MovieList.txt");
        	ObjectOutputStream object2=new ObjectOutputStream(object1);
        	object2.writeObject(movies);
        	System.out.println("Object has been serialized");
        }
        
        catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        

       
    }

    private static void displayMovies(Movie[] movies) {
    	
        for (Movie movie : movies) {
        	
            if (movie != null) { 
            	movieDisplay(movie);
            	
            }
            
        }
    }

    private static void movieDisplay(Movie movie) {
    	System.out.println("Movie ID: " + movie.getMovieid());
        System.out.println("Name: " + movie.getName());
        System.out.println("Genre: " + movie.getGenre());
        System.out.println("Year: " + movie.getYear());
        System.out.println();
  		
	}

	private static void addMovie(Movie movie, Scanner scanner) {
        System.out.println("Enter movie id:");
        movie.setMovieid(scanner.nextInt());
        System.out.println("Enter movie name:");
        movie.setName(scanner.next());
        System.out.println("Enter genre:");
        movie.setGenre(scanner.next());
        System.out.println("Enter year:");
        movie.setYear(scanner.nextInt());
        
    }
}
