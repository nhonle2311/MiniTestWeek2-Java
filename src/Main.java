import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập số đối tượng sách Progammingbook: ");
        int n = scanner.nextInt();
        ProgammingBook[] progammingBooks = new ProgammingBook[n];
        String language = "Java";
        double sumPriceProgammingBoook = 0.0;
        int countProgammingBookLanguage = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("đối tượng ProgammingBook thứ: " + (i+1));
            progammingBooks[i] = new ProgammingBook();
            progammingBooks[i].setBookcode((int) (Math.random() * 100000));
            progammingBooks[i].setName("Progammingbook");
            progammingBooks[i].setAuthor("Kiều Anh Xinh");
            progammingBooks[i].setFrameWork("Angular");
            System.out.println("nhập giá sách Progamming thứ: " + (i+1));
            progammingBooks[i].setPrice(scanner.nextDouble());
            System.out.println("nhập Language cho sách Progamming thứ: " +(i + 1));
            scanner.nextLine();
            progammingBooks[i].setLanguage(scanner.nextLine());
            sumPriceProgammingBoook += progammingBooks[i].getPrice();
            if (Objects.equals(progammingBooks[i].getLanguage(), language)){
                countProgammingBookLanguage++;
            }
        }
        System.out.println(Arrays.toString(progammingBooks));
        System.out.println("Tổng tiền sách Progamming = " + sumPriceProgammingBoook);



        System.out.print("nhập số đối tượng sách Fictionbook:  ");
        int m = scanner.nextInt();
        FictionBook[] fictionBook = new FictionBook[m];
        double sumPriceFictionbook = 0;
        int countCategory = 0;
        int countFictionBookPrice = 0;
        String category = "Viễn tưởng 1";
        for (int j = 0; j < m; j++) {
            System.out.println("đối tượng Fictionbook thứ: " + (j+1));
            fictionBook[j] = new FictionBook();
            fictionBook[j].setBookcode((int) (Math.random() * 100000));
            fictionBook[j].setAuthor("Kiều Anh");
            fictionBook[j].setName("Fictionbook");
            System.out.println("nhập giá sách Fictionbook thứ: " + (j+1));
            fictionBook[j].setPrice(scanner.nextDouble());
            System.out.println("nhập Category sách Fictionbook thứ: " + (j+1));
            scanner.nextLine();
            fictionBook[j].setCategory(scanner.nextLine());
            sumPriceFictionbook += fictionBook[j].getPrice();
            if (Objects.equals(fictionBook[j].getCategory(), category)){
                countCategory++;
            }
            if (fictionBook[j].getPrice() < 100){
                countFictionBookPrice++;
            }
        }
        System.out.println(Arrays.toString(fictionBook));
        System.out.println("Tổng tiền sách Fictionbook: " +sumPriceFictionbook);


        System.out.println("---------------------------------------------------");

        double sumBook = sumPriceFictionbook + sumPriceProgammingBoook;
        System.out.println("Tổng tiền sách ProgammingBook và FictionBook = " + sumBook);
        System.out.println("Số sách ProgammingBook có language Java: " + countProgammingBookLanguage);
        System.out.println("Số sách FictionBook có Category viễn tưởng 1: " +countCategory);
        System.out.println("Số sách Fiction < 100: " + countFictionBookPrice);

    }
}