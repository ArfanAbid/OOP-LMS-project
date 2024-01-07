# Library Management System

This Java-based project implements a library management system for UET Central Library. The system allows users and guests to interact with the library functionalities, including viewing available books, searching for books, borrowing books, and adding new books to the collection.

## Usage

### Prerequisites

To run this application, ensure you have the following installed:

- Java Development Kit (JDK)
- IDE (Integrated Development Environment) for Java (e.g., IntelliJ IDEA, Eclipse)

### Running the Application

1. Clone the repository to your local machine:

    ```bash
    git clone https://github.com/ArfanAbid/OOP-LMS-project.git
    ```

2. Open the project in your preferred Java IDE.

3. Run the `Main` class located in the `Arfan.com` package.

## Code Overview

The code is organized into several classes:

### `Main.java`

The main entry point of the application. It provides a command-line interface for users and guests to interact with the library functionalities.

### `Library.java`

Contains methods for displaying the library introduction, menus for guests and registered users, and ending information.

### `Books.java`

Manages the book-related operations such as displaying available books, searching books, adding books, and borrowing books. It also handles writing user actions to a CSV file (`record.csv`).

## Features

- **Guest Access**: Allows guests to view available books and perform searches.
- **User Registration**: Enables new users to register by providing an ID and name.
- **User Access**: Registered users can view books, search, add new books, borrow books, or log out.
- **Logging**: Records user actions (adding books, borrowing) in a CSV file (`record.csv`).

## Contributions

Contributions to improve the system and add new features are welcome! 🤝


