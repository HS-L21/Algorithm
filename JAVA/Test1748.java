import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1748 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long N = Long.parseLong(br.readLine());

        int result = getNum(N);

        System.out.print(result);
    }

    private static int getNum(long N) {
        int cnt = 0;
        for (int i = 1; i <= N; i++) {
            cnt += countDigits(i);
        }

        return cnt;
    }

    private static int countDigits(long num) {
        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        return count;
    }
}
