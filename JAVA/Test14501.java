import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test14501 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());    //상담하는 일자
        int[] days = new int[N];
        int[] people = new int[N];

        StringTokenizer st;

        for(int i = 0; i < N ; i++){
            st = new StringTokenizer(br.readLine());
            days[i] = Integer.parseInt(st.nextToken());
            people[i] = Integer.parseInt(st.nextToken());
        }

        int[] maxVal = new int[N + 1];

        for(int i = 0; i < N; i++){
            if(i + days[i] <= N){
                maxVal[i + days[i]] = Math.max(maxVal[i + days[i]],
                maxVal[i] + people[i]);
            }
            maxVal[i + 1] = Math.max(maxVal[i+1], maxVal[i]);
        }

        System.out.print(maxVal[N]);
    }
}
