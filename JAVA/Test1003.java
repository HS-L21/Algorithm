import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1003 {
    static int[] fibonacci0 = new int[41];
    static int[] fibonacci1 = new int[41];

    public static void main(String[] args) throws IOException {
        fibonacci0[0] = 1;  // N = 0 일 때 0 호출 횟수
        fibonacci1[0] = 0;  // N = 0 일 때 1 호출 횟수
        fibonacci0[1] = 0;  // N = 1 일 때 0 호출 횟수
        fibonacci1[1] = 1;  // N = 1 일 때 1 호출 횟수

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());  // 주어지는 테스트 케이스 수

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            fibonacci(N);

            System.out.println(fibonacci0[N] + " " + fibonacci1[N]);
        }
    }

    private static void fibonacci(int N) {
        for (int i = 2; i <= N; i++) {
            fibonacci0[i] = fibonacci0[i - 1] + fibonacci0[i - 2];
            fibonacci1[i] = fibonacci1[i - 1] + fibonacci1[i - 2];
        }
    }
}
