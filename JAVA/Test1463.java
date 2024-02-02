import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Test1463 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[N + 1];
        Arrays.fill(dp, Integer.MAX_VALUE); 
        dp[1] = 0;  //1은 이미 1이므로 추가적인 연산이 필요하지 않음

        for (int i = 2; i <= N; i++) {
            dp[i] = Math.min(dp[i], dp[i - 1] + 1);     //숫자 1에 도달
            if (i % 2 == 0) dp[i] = Math.min(dp[i], dp[i / 2] + 1); // 2로 나누어지는 경우
            if (i % 3 == 0) dp[i] = Math.min(dp[i], dp[i / 3] + 1); // 3으로 나누어지는 경우
        }

        System.out.print(dp[N]);
    }
}
