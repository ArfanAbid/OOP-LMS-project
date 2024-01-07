package Arfan.com;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        int userId=0;
        String userName=null;
        Library.intro();
        Books a = new Books();
        a.initializingbooks();

        int choice = 0;
        Scanner sc = new Scanner(System.in);

        do {
            try {
                Library.introduction();
                System.out.print("Enter your choice [1-3]: ");
                choice = sc.nextInt();
                sc.nextLine(); // Consume newline character

                switch (choice) {

                    case 1:
                                choice = 0;
                                do {
                                    try {
        //                              Thread.sleep(5000);  // sleep for 5 sec
                                        Library.displayGuest();
                                        System.out.print("Enter your choice [1-3]: ");
                                        choice = sc.nextInt();
                                        sc.nextLine(); // Consume newline character

                                        switch (choice) {
                                            case 1:
                                                a.showBooks();
                                                break;
                                            case 2:
                                                a.searchBook();
                                                break;
                                            case 3:
                                                System.out.println("Returning to Main Pannel....\n");
                                                break;
                                            default:
                                                System.out.println("Invalid choice. Please enter a number between 1 and 3.");
                                                break;

                                        }
                                    } catch (Exception e) {
                                        System.out.println("An error occurred: Enter valid Choice  " );
                                        sc.nextLine(); // Clear the input buffer
                                        choice=0;
                                    }
                                } while (choice != 3);
                                choice=0;

                               break;

                    case 2:
                                        boolean validInput = false;
                                        while (!validInput) {
                                            try {
                                                System.out.print("Enter user ID: ");
                                                userId = sc.nextInt();
                                                sc.nextLine(); // Clear the input buffer

                                                System.out.print("Enter user Name: ");
                                                userName = sc.nextLine();
                                                System.out.println("\nWelcome "+userName +"!");

                                                validInput = true; // Break out of the loop if input is valid
                                            } catch (InputMismatchException e) {
                                                System.out.println("Invalid input for user ID. Please enter an integer.");
                                                sc.nextLine(); // Clear the input buffer
                                            }
                                        }

                                    choice = 0;
                                 do {
                                    try {
        //                            Thread.sleep(5000);  // sleep for 5 sec
                                        Library.displayMember();

                                        System.out.print("Enter your choice [1-5]: ");
                                        choice = sc.nextInt();
                                        sc.nextLine(); // Consume newline character

                                        switch (choice) {
                                            case 1:
                                                a.showBooks();
                                                break;
                                            case 2:
                                                a.searchBook();
                                                break;
                                            case 3:
                                                a.addBook(userId,userName);
                                                break;
                                            case 4:
                                                a.borrowBook(userId,userName);
                                                break;
                                            case 5:
                                                System.out.println("Successfully LogOut..... \n");
                                                break;
                                            default:
                                                System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                                                break;
                                        }
                                    } catch (Exception e) {
                                        System.out.println("An error occurred: Enter valid Choice  ");
                                        sc.nextLine(); // Clear the input buffer
                                        choice=0;
                                    }
                                } while (choice != 5);
                                 choice=0;
                             break;

                    case 3:
                                Library.endInfo();

                    default:
                                System.out.println("Invalid choice. Please enter a number between 1 and 3.");
                        break;
                }

            } catch (Exception e) {
                System.out.println("An error occurred: Enter a valid choice.");
                sc.nextLine(); // Clear the input buffer
                choice = 0; // Reset choice to continue the loop
            }
        } while (choice!=3);
        sc.close();



    }


}
