package org.example.homework160224;

import java.util.Scanner;

public class BookApp {

    public static void main(String[] args) {
        BookStorage bookStorage = new BookStorage();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Please input book name:  ");
            String nameFromUser = scanner.nextLine();

            try{
                Book book = bookStorage.getBookByName(nameFromUser);
                System.out.println("Your book is : " + book);
                break;
            } catch (BookNotFoundException | IncorrectBookNameException exception) {
                System.out.println("We have a problem " + exception.getMessage());
                System.out.println("Please try again");
            }
        }
    }
}
