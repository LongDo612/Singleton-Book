public class main {
    public static void main(String[] args) {
        BookBorrower bookBorrower1 = new BookBorrower();
        BookBorrower bookBorrower2 = new BookBorrower();

        bookBorrower1.borrowBook();
        System.out.println("BookBorrower1 asked to borrow the book\n");
        System.out.println("BookBorrower1 Borrowed Book Author and Title: \n");
        System.out.println(bookBorrower1.getInfo());


        bookBorrower2.borrowBook();
        System.out.println("BookBorrower2 asked to borrow the book\n");
        System.out.println("BookBorrower2 Borrowed Book Author and Title: \n");
        System.out.println(bookBorrower2.getInfo());

        bookBorrower1.returnBook();
        System.out.println("BookBorrower1 returned the book\n");

        bookBorrower2.borrowBook();
        System.out.println("BookBorrower2 Author and Title: ");
        System.out.println(bookBorrower1.getInfo());
    }
}
