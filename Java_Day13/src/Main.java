import java.io.FileReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException {
       int sum = 0;
       for(int i = 0; i<=10; i++){
           if(i%3==0) continue; sum +=i;
           System.out.println(sum);
       }
    }
}