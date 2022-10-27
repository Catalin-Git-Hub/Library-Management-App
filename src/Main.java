public class Main {
    /*      Ex1: Library management system

            Create class Library -> arrayOfBooks, nameOfLibrary;
            Create class Book -> name, isbn, authorName, nrOfPages, editorialName, kindOfLiterature, price.

            Before starting the application we should populate the library with books.

            The application starts by presenting the following menu:

            Welcome to the x library -> x will represent the nameOfLibrary

            1.Show books.
            2.Buy a book. (Offer possibility to choose a book)
            3.Show books by name enter from the console. (Offer possibility to choose a book)
            4.Show books by authorNme enter from the console.(Offer possibility to choose a book)
            5.Show books by editorialName enter from the console.(Offer possibility to choose a book)
            6.Show books by price enter from the console.(Offer possibility to choose a book)
            7.Show books that have more then nrOfPages enter from the console.(Offer possibility to choose a book)
            8.Show books by kindOfLiterature enter from the console.(Offer possibility to choose a book)
            9.Calculate and show total price for all books in library.
            10.Calculate and show the average price of all books.
            11.Show the book with the lowest price.
            12.Show the book with the highest price.
            13.Show the book with the largest number of pages.
            14.Show the book with the smallest number of pages.
            15.Show the book with the longest name.
            16.Show client history of bought books.
            17.Exit

            The user must choose options until he chooses to leave the application. If he choose a correct option, after executing that option, he should be asked if he wants to choose another oprtion,
            if he answer with y we should show the menu again and repeat the process, if he answer with n the application will finish.
            Ex2: Petrol Station App
            Simulate the process of refuelling. Within the while loop ask user if you should
            continue or finish. For every entered “continue” command you should add a specific
            amount of petrol and money (both of type double) and view it on the console.
            At the end user should pay for petrol. Consider multiple possibilities, like:
            The user paid exactly as much as required.
            The user paid too much (cashier should return the rest of the money).
            The user paid too little – should be asked for the rest.
    */
    public static void main(String[] args) {
        Library library = new Library("Java Library");
        library.customizeAdministrativeStuff();
        library.startCustomerApp();

    }
}
