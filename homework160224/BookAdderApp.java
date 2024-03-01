package org.example.homework160224;
import java.util.Scanner;

public class BookAdderApp {
    public static void main(String[] args) {
        BookStorage bookStorage = new BookStorage();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Please input book name: ");
            String nameFromUser = scanner.nextLine();

            System.out.println("Please input year of publication: ");
            int yearFromUser = scanner.nextInt();
            scanner.nextLine(); // Clear the buffer after inputting the number

            try {
                bookStorage.addBook(nameFromUser, yearFromUser);
                System.out.println("Book added successfully!");
            } catch (StorageFullException ex) {
                System.out.println("Not possible to add more books. Storage is full.");
                break;
            }

            System.out.println("Would you like to add another book? (yes/no)");
            String choice = scanner.nextLine();
            if (!choice.equalsIgnoreCase("yes")) {
                break;
            }
        }
    }
}
