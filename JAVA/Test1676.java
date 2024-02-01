import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1676 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        //뒷자리가 0이 생성되는것 : 10을 곱하는것 -> 10은 2 * 5로 생김
        //2 * 5를 찾아야함 : 항상 5의 개수가 적으므로 5로 나누면 됨! 

        int cnt = 0;

        while(N >= 5){
            cnt += N / 5;
            N /= 5;
        }
        System.out.println(cnt);
    }
}
