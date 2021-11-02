import java.io.*;

public class Stream {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
        String str = br.readLine();
        System.out.println(str);
        /*
        char[] a = new char[1024];
        reader.read(a);

        System.out.println(a);
*/
    }
}
