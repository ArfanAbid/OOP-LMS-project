package Arfan.com;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.Scanner;

public class Books {
    ArrayList<String> Books = new ArrayList<>();
    ArrayList<String> Author = new ArrayList<>();
     int indexBorrow;
     int userId=0;
     String userName=null;
     Date date=new Date();
    // ******  Initializing some books to library   ****
    public void initializingbooks() {

        Books.add("Introduction to python");     Author.add("James");
        Books.add("Machine learning Algorithm"); Author.add("Charles");
        Books.add("Complete guide to DSA");      Author.add("Folax");
        Books.add("Introduction to OOP");        Author.add("Robert");
        Books.add("Introduction to ICT");        Author.add("Lames");
        Books.add("CryptoGraph");                Author.add("Paul");
        Books.add("Complete guide to AI");       Author.add("Iffi");
        Books.add("Discrete Structure");         Author.add("Leford");
        Books.add("Master Cyber Security");      Author.add("Harry");
        Books.add("Probability and Statics");    Author.add("Konal");
//        Books.add("DevOOp");                     Author.add("Krishna");
//        Books.add("Complete Django FrameWork");  Author.add("Jeorge");
//        Books.add("Operating System");           Author.add("Terry");


    }

    //               ***************  Show All Books Available  ****************
    public void showBooks() {
        System.out.println("\nAvailable Books are:");
        for (int i = 0; i < Books.size(); i++) {
            System.out.println(i + 1 + ". " + Books.get(i) + " By " + Author.get(i));
        }

    }

    //                  ******************  Add Book  **************
    public void addBook(int userId,String userName) {
        // Adding Book name
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Title of Book: ");
        String addBook = sc.nextLine();
        Books.add(addBook);
        // Adding Author name
        String addAuthor;
        while (true) {
            try {
                System.out.print("Enter a Author Name: ");
                addAuthor = sc.nextLine();

                if (!addAuthor.matches("[a-zA-Z ]+")) {
                    throw new IllegalArgumentException("Please enter a string value.(not integer)");
                }

                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        Author.add(addAuthor);
        appendRecord(userId, userName, addBook, "Added");
        System.out.println("\t ****  Successfully Added  ***** \n\n");

    }


    //        ********* Search Book ***********

    public void searchBook() {

        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.print("Enter the name of the book (or 'exit' to quit): ");
            String searchBook = scanner.nextLine();

            if (searchBook.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the program...");
                break;
            }

            boolean bookFound = false;

            for (int i = 0; i < Books.size(); i++) {
                if (Books.get(i).equalsIgnoreCase(searchBook)) {
                    String bookName = Books.get(i);
                    String authorName = Author.get(i);
                    System.out.println("Book Found!");
                    System.out.println("Book Name: " + bookName);
                    System.out.println("Author: " + authorName);
                    bookFound = true;
                    break;
                }
            }

            if (bookFound) {
                System.out.println("Book "+ searchBook +" is Available"   );
                break;
            } else {
                System.out.println("Book not found. Please try again.");
            }
        }
    }


    public void borrowBook(int userId,String userName) {

        String   removeBook;
        Scanner scanner = new Scanner(System.in);


        while (true) {

            System.out.print("Enter the name of the book (or 'exit' to quit): ");
            String searchBook = scanner.nextLine();

            if (searchBook.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the program...");
                break;
            }

            boolean found = false;
            for (int i = 0; i < Books.size(); i++) {
                if (Books.get(i).equalsIgnoreCase(searchBook)) {
                    if(i!=-1) {
                        removeBook = Books.get(i);
                        appendRecord(userId, userName, removeBook, "Borrowed");

                        Books.remove(i);
                        Author.remove(i);
                        indexBorrow=i;

                    }
                    found = true;
                    break; // Exit the loop after removing the book

                }
            }

            if (!found) {
                System.out.println("Book '" + searchBook + "' not found. Please try again.");
            }
            else {
                System.out.println("\t Book '" + searchBook + "' has been Borrowed Successfully.");
                break;
            }
        }
    }


    private void appendRecord(int userId, String userName, String bookName, String borrowOrAdd) {
        String record = userId + "," + userName + "," + bookName + "," + borrowOrAdd + "," + date + "\n";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\Semester 2\\OOP\\OOP project\\Arfan\\com\\record.csv", true))) {
            writer.write(record);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the record file.");
        }
    }



}
