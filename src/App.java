import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Path path = Paths.get("test.out");
        Scanner scanner = new Scanner(Files.newBufferedReader(path));
        String str;
        while (scanner.hasNextLine()) {
            str = scanner.nextLine();
            System.out.println(str);
        }
        scanner.close();
    }
}
