import java.util.Scanner;

public class Library {

    private String libraryName;
    private Book[] books = new Book[2];
    private Customer currentCustomer;

    Scanner scannerText = new Scanner(System.in);
    Scanner scannerNumber = new Scanner(System.in);

    public Library(String libraryName) {
        this.libraryName = libraryName;
    }

    public void customizeAdministrativeStuff() {
        populateLibrary();
        checkIn();
    }

    public void populateLibrary() {
        System.out.println("Introduce your books please:");
        for (int i = 0; i < books.length; i++) {

            System.out.println("Book nr." + i + ":");

            System.out.print("Enter name: ");
            String name = scannerText.nextLine();

            System.out.print("Enter isbn: ");
            String isbn = scannerText.nextLine();

            System.out.print("Enter author name: ");
            String authorName = scannerText.nextLine();

            System.out.print("Enter nrOfPages: ");
            int nrOfPages = scannerNumber.nextInt();

            System.out.print("Enter editorial Name: ");
            String editorialName = scannerText.nextLine();

            System.out.print("Enter type: ");
            String type = scannerText.nextLine();

            System.out.print("Enter price: ");
            double priceInRon = scannerNumber.nextDouble();
            long priceInBani = (long) (priceInRon * 100);

            Book currentBook = new Book(name, isbn, authorName, nrOfPages, editorialName, type, priceInBani);
            books[i] = currentBook;
        }
    }

    public void checkIn() {
        System.out.println("Enter your name: ");
        String clientName = scannerText.nextLine();
        Customer customer = new Customer(clientName);
        currentCustomer = customer;
    }

    public void startCustomerApp() {
        int option;
        do {
            showMenu();
            System.out.println("Choose an option: ");
            option = scannerNumber.nextInt();
            switch (option) {
                case 1:
                    showBooks();
                    break;
                case 2:
                    buyBook();
                    break;
                case 3:
                    showBooksByName();
                    break;
                case 4:
                    System.out.println("Option " + option + " selected");
                    break;
                case 5:
                    System.out.println("Option " + option + " selected");
                    break;
                case 6:
                    showBooksByPrice();
                    break;
                case 7:
                    System.out.println("Option " + option + " selected");
                    break;
                case 8:
                    System.out.println("Option " + option + " selected");
                    break;
                case 9:
                    System.out.println("Option " + option + " selected");
                    break;
                case 10:
                    double averageInRoni = calculateAveragePrice();
                    System.out.println("Average price is " + averageInRoni + " ron");
                    break;
                case 11:
                    System.out.println("Option " + option + " selected");
                    break;
                case 12:
                    System.out.println("Option " + option + " selected");
                    break;
                case 13:
                    largestNumberOfPages();
                    break;
                case 14:
                    System.out.println("Option " + option + " selected");
                    break;
                case 15:
                    System.out.println("Option " + option + " selected");
                    break;
                case 16:
                    System.out.println("Option " + option + " selected");
                    break;
                case 17:
                    System.out.println("Exit.");
                default:
                    System.out.println("Wrong option. Please choose a valid option.");
            }
        } while (option != 17);
    }

    public void showMenu() {
        System.out.println("--Welcome to the " + libraryName + "!");
        System.out.println("1.Show books");
        System.out.println("2.Buy a book");
        System.out.println("3.Show books by name");
        System.out.println("4.Show books by authorName");
        System.out.println("5.Show books by editorialName");
        System.out.println("6.Show books with price between provided range");
        System.out.println("7.Show books that have more then nrOfPages");
        System.out.println("8.Show books by type");
        System.out.println("9.Calculate and show total price for all books in library");
        System.out.println("10.Calculate and show the average price of all books");
        System.out.println("11.Show the book with the lowest price");
        System.out.println("12.Show the book with the highest price");
        System.out.println("13.Show the book with the largest number of pages");
        System.out.println("14.Show the book with the smallest number of pages");
        System.out.println("15.Show the book with the longest name.");
        System.out.println("16.Show client history of bought books.");
        System.out.println("17.EXIT!");
    }

    public void showBooks() {
        System.out.println("Our avaiable books are:");
        for (int i = 0; i < books.length; i++) {
            Book currentBook = books[i];
            System.out.println(i + "." + currentBook.toString());

        }
    }

    public void showBooksByPrice() {
        System.out.println("Enter minimum price: ");
        double minimumPriceInRoni = scannerNumber.nextDouble();
        long minimumPriceInBani = (long) (minimumPriceInRoni * 100);
        System.out.println("Enter maximum price: ");
        double maximumPriceInRoni = scannerNumber.nextDouble();
        long maximumPriceInBani = (long) (minimumPriceInRoni * 100);
        System.out.println("Selected books are: ");
        for (int i = 0; i < books.length; i++) {
            Book currentBook = (Book) books[i];
            if (currentBook.getPrice() >= minimumPriceInBani && currentBook.getPrice() <= maximumPriceInBani)
            System.out.println(i + "." + currentBook);
        }
    }
    
    
    public void showBooksByName() {
        System.out.println("Enter book name: ");
        String name = scannerText.nextLine();
        System.out.println("Books having name " + name + "are: ");
        for (int i = 0; i < books.length; i++) {
            Book currentBook = books[i];
            if (currentBook.getName().equals(name)) ;
            {
                System.out.println(i + "." + currentBook);
            }

        }
    }

    public double calculateAveragePrice() {
        long averageInBani;
        long sum = 0;
        for (int i = 0; i < books.length; i++) {
            Book currentBook = books[i];
            sum += currentBook.getPrice();
        }
        averageInBani = sum / books.length;

        return averageInBani/100.0;
    }

    public void largestNumberOfPages(){
        Book largestBook = books[0];
        int maxNumarPagini = books[0].getNrOfPages();
        for (int i = 1; i < books.length; i++) {
            if (books[i].getNrOfPages() > maxNumarPagini) {
                maxNumarPagini = books[i].getNrOfPages();
                largestBook = books[i];
            }
        }
        System.out.println("The largest book is: " + largestBook);
    }

    public void buyBook(){
        showBooks();
        System.out.print("Choose a book: ");
        int selectedBookNumber = scannerNumber.nextInt();
        Book selectedBook = books[selectedBookNumber];
        System.out.println("Selected book: " + selectedBook);
        System.out.println("You have to pay: " + (selectedBook.getPrice()/100.0));
        // TODO: De implementat plata efectiva.
        currentCustomer.addBookToCartOfBooks(selectedBook);
    }

    public void startApp() {

    }

    public Customer getCurrentCustomer() {
        return currentCustomer;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public Book[] getArrayOfBooks() {
        return books;
    }

    public void setArrayOfBooks(Book[] arrayOfBooks) {
        this.books = arrayOfBooks;
    }
}
