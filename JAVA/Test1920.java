import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Test1920 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] base = new int[N];
        String[] str = br.readLine().split(" ");
        for(int i = 0; i < N; i++){
            base[i] = Integer.parseInt(str[i]);
        }

        Arrays.sort(base);

        int M = Integer.parseInt(br.readLine());
        String[] str1 = br.readLine().split(" ");

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < M; i++){
            int target = Integer.parseInt(str1[i]);
            int result = isTrue(base, target);
            sb.append(result).append("\n");
        }

        System.out.print(sb.toString());
    }

    private static int isTrue(int[] base, int target){
        int start = 0; int end = base.length -1;

        while(start <= end){
            int mid = (start + end ) / 2;   //중앙 값
            if(base[mid] == target){
                return 1;
            }else if(base[mid] > target){
                end = mid -1;
            }else{
                start = mid + 1;
            }
        }
        
        return 0;
    }
}
