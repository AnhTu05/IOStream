import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class Main {
    public Main() throws Exception {
        System.out.print("Đường dẫn file: ");
        Scanner sc = new Scanner(System.in);
        String url = sc.nextLine();
        File file = new File(url);
        System.out.print("Kích thước: " + file.length() + " byte");
    }
    public static void main(String[] args) throws Exception{
        new Main();
    }
}