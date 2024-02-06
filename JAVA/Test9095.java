import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test9095 {
    static int[] dp = new int[11];
    public static void main(String[] args) throws IOException{
        //1, 2, 3dl 고정적으로 사용 
        //dp[n] = dp[n-1] + dp[n-2] + dp[n-3] 
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for(int i = 4; i < 11; i++){
            dp[i] =  dp[i-1] + dp[i-2] + dp[i-3];
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < T; i++){
            int N = Integer.parseInt(br.readLine());
            sb.append(dp[N]).append("\n");
        }

        System.out.print(sb.toString());
    }    
}
