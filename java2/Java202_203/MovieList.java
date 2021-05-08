package Java202_203;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MovieList {
    public static void main(String[] args) {
        List<String> movies = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int n = 0;
        movies.add("movie1");
        movies.add("movie2");
        movies.add("movie3");
        movies.add("movie4");
        movies.add("movie5");
        movies.add("movie6");
        movies.add("movie7");
        movies.add("movie8");
        do{
            System.out.println("Act with your movies list: ");
            System.out.println("1. End action.");
            System.out.println("2. Add new movies.");
            System.out.println("3. Print your list.");
            System.out.println("4. Alter your movie name.");
            System.out.println("5. Delete a movie from the list.");
            System.out.println("6. Search a film.");
            n = scan.nextInt();
            switch (n) {
                case 1 -> System.out.println("Thank you for using our program.");
                case 2 -> getAdd(movies);
                case 3 -> getPrint(movies);
                case 4 -> getAlter(movies);
                case 5 -> getDelete(movies);
                case 6 -> getSearch(movies);
            }
        }while(n != 1);
    }

    public static void getAdd(List<String> movies){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter movie name.");
        String movie = scan.next();
        movies.add(movie);
    }

    public static void getPrint(List<String> movies){
        System.out.println("Your movies list: ");
        movies.forEach(System.out::println);
    }

    public static void getAlter(List<String> movies){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the movie name that you want to alter: ");
        String movie = scan.next();
        System.out.println("Enter the new name: ");
        String newMovie = scan.next();
        for (int i = 0; i < movies.size(); i++){
            if (movies.get(i).equals(movie)){
                movies.set(i, newMovie);
            }
            else
                System.out.println("The name you enter does not exits.");
        }
    }

    public static void getDelete(List<String> movies){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the movie name that you want to delete: ");
        String movie = scan.next();
        boolean delete = movies.remove(movie);
        if (!delete){
            System.out.println("The name you enter does not exits");
        }
    }

    public static void getSearch(List<String> movies){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter movie name: ");
        String movie = scan.next();
        for (int i = 0; i < movies.size(); i++){
            if (movies.get(i).equals(movie)){
                System.out.println("The movie have exits.");
                System.out.println("Locate: " + (i+1));
            }
        }
    }
}
