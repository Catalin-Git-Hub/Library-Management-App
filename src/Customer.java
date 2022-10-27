public class Customer {
    private String name;
    private Book[] cartOfBooks = new Book[3];

    public Customer(String name) {
        this.name = name;
    }

    public void addBookToCartOfBooks(Book book) {
        int emptyIndex = calculateFirstEmptyIndex();
        if (emptyIndex != -1) {
            cartOfBooks[emptyIndex] = book;
        }
    }

    public boolean isCartEmpty(){
        boolean isEmpty = true;
        for (int i = 0; i < cartOfBooks.length; i++) {
            if (cartOfBooks[i] !=null) {
                isEmpty = false;
                break;
            }
        }
        return isEmpty;
    }

    // 16.Show cart of books brought
    public void showCartOfBooksBought() {
        if (!isCartEmpty()) {
            for (int i = 0; i < cartOfBooks.length; i++) {
                if (cartOfBooks[i] != null) {
                    System.out.println(cartOfBooks[i]);
                }
            }
        } else {
            System.out.println("Your cart is empty !");
        }
        System.out.println();
    }

    private int calculateFirstEmptyIndex() {
        int firstEmptyIndex = -1;
        for (int i = 0; i < cartOfBooks.length; i++) {
            if (cartOfBooks[i] == null) ;
            {
                firstEmptyIndex = i;
                break;
            }
        }
        return firstEmptyIndex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book[] getCartOfBooks() {
        return cartOfBooks;
    }

    public void setCartOfBooks(Book[] cartOfBooks) {
        this.cartOfBooks = cartOfBooks;
    }
}
