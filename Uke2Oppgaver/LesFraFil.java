import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class LesFraFil {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(new File("Untitled.txt"));
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}