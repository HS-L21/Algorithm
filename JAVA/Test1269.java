import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Test1269 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());   //A의 갯수
        int M = Integer.parseInt(st.nextToken());   //B의 갯수

        HashSet<Integer> hA = new HashSet<>();
        int[] A = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            int temp = Integer.parseInt(st.nextToken());
            A[i] = temp;
            hA.add(temp);
        }

        HashSet<Integer> hB = new HashSet<>();
        int[] B = new int[M];
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < M; i++){
            int temp = Integer.parseInt(st.nextToken());
            B[i] = temp;
            hB.add(temp);
        }

        int cntA = 0;
        int cntB = 0;

        for(int i = 0; i < M; i++){
            if(!hA.contains(B[i])) cntA++;
        }
        for(int i = 0; i < N; i++){
            if(!hB.contains(A[i])) cntB++;
        }

        System.out.print(cntA + cntB);
    }    
}
