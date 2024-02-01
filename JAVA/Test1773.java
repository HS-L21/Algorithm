import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test1773 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());   //학생 수
        int C = Integer.parseInt(st.nextToken());   //폭죽쇼가 긑나는 시간

        int cnt = 0;

        int[] students = new int[N];

        for(int i = 0; i < N; i++){
            students[i] = Integer.parseInt(br.readLine());
        }

        for(int i = 1; i <= C; i++){
            for(int j = 0; j < N; j++){
                if(i % students[j] == 0) {
                    cnt++;
                    break;
                }
            }
        }

        System.out.print(cnt);

    }
}
