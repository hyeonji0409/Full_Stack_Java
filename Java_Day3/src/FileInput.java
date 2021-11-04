import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileInput {
    public static void main(String[] args) throws IOException {
        /*BufferedReader br = new BufferedReader( new FileReader("D:\\Full_Stack_Dev\\File_IO\\sample.txt"));

        String line = br.readLine();

        System.out.println(line);

        br.close();*/

        Scanner sc = new Scanner(new File("D:\\\\Full_Stack_Dev\\\\File_IO\\\\sample.txt"));

        String line = sc.nextLine();

        System.out.println(line);

        sc.close();
    }
}
