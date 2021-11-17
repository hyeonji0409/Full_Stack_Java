import java.util.Scanner;

class Product {
    Scanner scan = new Scanner(System.in);
    String prdNo;
    String prdName;
    int prdPrice;
    int prdYear;
    String prdMaker;

    public Product(String prdNo, String prdName, int prdPrice, int prdYear, String prdMaker) {
        this.prdNo = prdNo;
        this.prdName = prdName;
        this.prdPrice = prdPrice;
        this.prdYear = prdYear;
        this.prdMaker = prdMaker;
    }

    @Override
    public String toString() {
        return  prdNo + "   " +  prdName + "    " + prdPrice + "    " + prdYear + " " + prdMaker;
    }

}

public class ProductTest {
    public static void main(String[] args) {

        Product p1 = new Product("001", "노트북", 1200000, 2021, "삼성");
        Product p2 = new Product("002", "모니터", 300000, 2021, "LG");
        Product p3 = new Product("003", "마우스", 30000, 2020, "로지텍");

        System.out.println("상품번호  상품명  가격  연도  제조사");
        System.out.println("-------------------------------");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());


    }
}