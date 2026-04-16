package Lab3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieFunctions {
    public static void MovieList(Scanner scanner) {
        String answer;
        List<Movie> movieList = new ArrayList<>();

        do {
            movieList.add(EnterMovie(scanner));

            System.out.println("Would you like to add another movie (Y/N)?");
            answer = scanner.nextLine();

            while (!answer.equalsIgnoreCase("y") && !answer.equalsIgnoreCase("n")) {
                System.out.println("Invalid input, please enter Y or N");
                answer = scanner.nextLine();
            }
        } while (answer.equalsIgnoreCase("y"));

        DisplayMovieList(movieList);
    }

    public static Movie EnterMovie(Scanner scanner) {
        System.out.println("Please enter the movie name");
        String name = scanner.nextLine().trim().replaceAll("\\s+", " "); // Clean up spaces

        System.out.println("Please enter the movie director");
        String director = scanner.nextLine().trim().replaceAll("\\s+", " ");

//        System.out.println("Please enter the movie release year");
//        int releaseYear = scanner.nextInt();
//        scanner.nextLine();
        int releaseYear;

        while (true) {
            try {
                System.out.println("Please enter the movie release year");
                releaseYear = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException err) {
                System.out.println("Invalid input, please enter a valid year");
            }
        }

        System.out.println("Please enter the movie genre");
        String genre = scanner.nextLine().trim().replaceAll("\\s+", " ");

        return (new Movie(name, director, releaseYear, genre));
    }

    public static void DisplayMovieList(List<Movie> movieList) {
        int listAmount = 0;
        int total = movieList.size();

        System.out.println("\nMovies in List: " + total + "\n" + "=".repeat(30));

        for (var movie: movieList) {
            listAmount++;

            System.out.println(
                    "\nMovie " + listAmount
                    + "\n" + "-".repeat(30)
                    + "\nName: " + movie.name
                    + "\nDirector: " + movie.director
                    + "\nRelease Year: " + movie.releaseYear
                    + "\nGenre: " + movie.genre
            );
        }
    }
}
