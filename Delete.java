import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.HttpURLConnection;
import java.util.Scanner;

public class Delete {
    public Delete() throws Exception {
        System.out.print("Đường dẫn file: ");
        Scanner sc = new Scanner(System.in);
        String url = sc.nextLine();
        File file = new File(url);
        file.deleteOnExit();
        System.out.print("File đã bị xóa!");
    }
    public static void main(String[] args) throws Exception{
        new Delete();
    }
}