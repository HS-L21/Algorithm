import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1436 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // N 입력 받기
        int n = Integer.parseInt(br.readLine());

        // N번째 종말의 수 출력
        int result = findApocalypseNumber(n);
        System.out.println(result);
    }

    public static int findApocalypseNumber(int n) {
        int count = 0;
        int num = 666;

        while (true) {
            if (String.valueOf(num).contains("666")) {
                count++;
            }
            if (count == n) {
                return num;
            }
            num++;
        }
    }
}
