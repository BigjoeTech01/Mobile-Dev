import java.util.Scanner;
public class MovieTicketBookingSystem {
 public static void main(String[] args) {
 Scanner movie = new Scanner(System.in);
 int no_of_seats_available = 5;
 String[] Movielist = {"Awake o Christian", "Abattoir", "The Forge"};
 while (true) {
 System.out.println("Enter movie name or type 'exit' to end operation: 
");
 String movieName = movie.nextLine();
 
 if (movieName.equalsIgnoreCase("exit")) {
 System.out.println("Exiting System...");
 break;
 }
 System.out.println("Enter the number of seats you wish to book: ");
 int requiredSeats = movie.nextInt();
 movie.nextLine();
 boolean isMovieFound = false;
 for (int i = 0; i < Movielist.length; i++) { // Fix array index issue
 if (Movielist[i].equalsIgnoreCase(movieName)) {
 isMovieFound = true;
 if (requiredSeats <= no_of_seats_available) {
 no_of_seats_available -= requiredSeats;
 System.out.println("Ticket(s) successfully booked for " + 
movieName);
 } else {
 System.out.println("Error: Insufficient seats available.");
 }
 break;
 }
 }
 if (!isMovieFound) {
 System.out.println("Error: Movie unavailable.");
 }
 }
 movie.close();
 }
}
