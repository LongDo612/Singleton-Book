public class SingletonBook {
    private String author;
    private String title;
    private static SingletonBook book;
    private static boolean isBorrowed;

    private SingletonBook() {
        this.author = "Victor Hugo";
        this.title = "Les Miserable";
        book = null;
        isBorrowed = false;
    }

    public static SingletonBook borrowBook() {
        if (!isBorrowed){
            if (book==null){
                book = new SingletonBook();
            }
                isBorrowed = true;
                return book;
        }
        return null;
    }

    public void returnBook() {
        isBorrowed = false;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getTitleAndAuthor() {
        return getTitle() + " by "+ getAuthor();
    }
}
