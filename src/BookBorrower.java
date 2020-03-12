public class BookBorrower {
    private SingletonBook borrowedBook;
    private boolean haveBook = false;

    public void borrowBook() {
        borrowedBook = SingletonBook.borrowBook();

        if (borrowedBook==null)
            haveBook = false;
        else
            haveBook = true;
    }

    public String getInfo() {
        if (haveBook)
            return borrowedBook.getTitleAndAuthor();
        return "\nCan not borrow due to book is unavaiable.\n";
    }

    public void returnBook() {
        borrowedBook.returnBook();
    }
}
