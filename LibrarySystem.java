class BookNotAvailableException extends Exception {
    public BookNotAvailableException(String message) {
        super(message);
    }
}

class LimitExceededException extends Exception {
    public LimitExceededException(String message) {
        super(message);
    }
}

class Book {
    String title;
    int availableCopies;

    public Book(String title, int availableCopies) {
        this.title = title;
        this.availableCopies = availableCopies;
    }
}

class User {
    String name;
    int borrowedBooks;

    public User(String name) {
        this.name = name;
        this.borrowedBooks = 0;
    }
}

public class LibrarySystem {
    public static void borrowBook(User user, Book book) throws BookNotAvailableException, LimitExceededException {
        if (book.availableCopies <= 0) {
            throw new BookNotAvailableException("Book '" + book.title + "' is not available!");
        }
        if (user.borrowedBooks >= 3) {
            throw new LimitExceededException("User '" + user.name + "' exceeded borrow limit!");
        }
        book.availableCopies--;
        user.borrowedBooks++;
        System.out.println(user.name + " borrowed '" + book.title + "'.");
    }

    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", 1);
        User user1 = new User("Dwarkesh");

        try {
            borrowBook(user1, book1);
            borrowBook(user1, book1);
        } catch (BookNotAvailableException e) {
            System.out.println(e.getMessage());
        } catch (LimitExceededException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Transaction Completed.");
        }

        try {
            Book book2 = new Book("Data Structures", 5);
            borrowBook(user1, book2);
            borrowBook(user1, book2);
            borrowBook(user1, book2);
            borrowBook(user1, book2);
        } catch (BookNotAvailableException e) {
            System.out.println(e.getMessage());
        } catch (LimitExceededException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Transaction Completed.");
        }
    }
}