class Book{

    String bookNo;
    String bookTitle;
    String bookAuthor;
    int bookYear;
    int bookPrice;
    String bookPublisher;

    public Book() {

    }

    public Book(String bookNo, String bookTitle, String bookAuthor, int bookYear, int bookPrice, String bookPublisher) {
        this.bookNo = bookNo;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookYear = bookYear;
        this.bookPrice = bookPrice;
        this.bookPublisher = bookPublisher;
    }

    @Override
    public String toString() {
        return bookNo + "  " + bookTitle + "  " + bookAuthor + "  " + bookYear + "  " + bookPrice + "  " + bookPublisher;
    }
}

class Magazine extends Book{
    int month;

    public Magazine(String bookNo, String bookTitle, String bookAuthor, int bookYear, int bookPrice, String bookPublisher,int month){
        this.bookNo = bookNo;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookYear = bookYear;
        this.bookPrice = bookPrice;
        this.bookPublisher = bookPublisher;
        this.month = month;
    }
    
    public String toString() {
        return super.toString()+"    "+month;
    }

}

public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book("B001  ","자바 프로그래밍","홍길동",25000,2021,"멀티출판사");
        Book book2 = new Book("B002  ","자바스크립트  ","이몽룡",30000,2020,"서울출판사");
        Book book3 = new Book("B003  ","HTML/CSS    ","성춘향",18000,2021,"강남출판사");

        System.out.println("도서번호  도서명          저자   가격    발행일   출판사");
        System.out.println("---------------------------------------------------------");
        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println(book3.toString());
        System.out.println();

        Magazine magazine1 = new Magazine("M001  ","자바 월드  ","홍길동  ",25000,2021,"  멀티출판사",5);
        Magazine magazine2 = new Magazine("M002  ","웹 월드   ","이몽룡  ",30000,2021,"  서울출판사",7);
        Magazine magazine3 = new Magazine("M003  ","게임 월드  ","성춘향 ",180000,2021,"  강남출판사",9);

        System.out.println("잡지번호  잡지명      발행인   가격    발행연도   출판사     발행월");
        System.out.println("---------------------------------------------------------");
        System.out.println(magazine1.toString());
        System.out.println(magazine2.toString());
        System.out.println(magazine3.toString());
    }
}
