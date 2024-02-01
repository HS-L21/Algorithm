import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Test1837 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        BigInteger P = new BigInteger(st.nextToken());
        BigInteger K = new BigInteger(st.nextToken());

        String result = getResult(P, K);

        System.out.print(result);
    }
    
    private static String getResult (BigInteger P, BigInteger K){
        
        BigInteger i = new BigInteger("1");

        while(true) {
			//i가 K보다 크거나 같아지면 GOOD 출력 그리고 반복문 종료
			if(i.compareTo(K) == 1 || i.compareTo(K) == 0) {
				return "GOOD";
				
			}
			//한번 반복 될때마다 i에 1더한다.
			i = i.add(BigInteger.ONE);
			
			//P가 i로 나눠지고, i가 K보다 작으면 BAD와 i값을 출력. 반복문 종료
			if(P.remainder(i).compareTo(BigInteger.ZERO) == 0 && i.compareTo(K) == -1) {
				return "BAD " + i;
				
			}
		}   
        
        
    }
}
