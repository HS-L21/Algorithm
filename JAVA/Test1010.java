import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test1010 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            long cnt = getCase(N, M);
            sb.append(cnt).append("\n");
        }

        System.out.print(sb.toString());
    }

    private static long getCase(int N, int M){
        double fac = 1;
        if(M - N == 0){
            return 1;
        }else{
            fac = Math.round(getFac(M) / (getFac(M - N) * getFac(N)));
            long result = (long)fac;    
            return result;
            
        }
        
    }

    private static double getFac(int A){

        if(A <= 1){
            return 1;
        }
        return getFac(A - 1) * A;
    }
}
