public class LibraryBook {
    private final String ISBN;
    private final String title;
    private final String  author;
    private int totalCopies;
    private int availableCopies;

    public LibraryBook(String ISBN, String title, String author, int totalCopies, int availableCopies) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.totalCopies = totalCopies;
        this.availableCopies = availableCopies;
    }

    public void setTotalCopies(int totalCopies) {
        this.totalCopies = totalCopies;
    }

    public void setAvailableCopies(int availableCopies) {
        this.availableCopies = availableCopies;
    }

    public void borrowBook(){
        if (availableCopies != 0){
            availableCopies --;
        }else {
            System.out.println("Out of Stock");
        }
    }
    public void returnBook(){
        if (availableCopies < totalCopies);
        availableCopies ++;
    }

    public boolean isAvailable(){
        return availableCopies > 0;
    }

    static void main(String[] args) {
        LibraryBook L1 = new LibraryBook("48-364783738","Introduction to Java","Joe",25,2457);
        System.out.println(L1.author);
        System.out.println(L1.title);
        System.out.println(L1.totalCopies);
        System.out.println(L1.availableCopies);
    }
}
