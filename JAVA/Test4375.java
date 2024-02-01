import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test4375 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;

        while((line = br.readLine()) != null){
            int n = Integer.parseInt(line);
            int num = 0;

            for(int i = 1; i <= n; i++){
                num = (num * 10 + 1) % n;
                if(num == 0){
                    System.out.println(i);
                    break;
                }
            }

        }
    }
}
