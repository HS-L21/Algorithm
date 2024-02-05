import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test1244 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    // 스위치의 갯수

        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) { // 스위치의 상태
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 학생 수
        int students = Integer.parseInt(br.readLine());

        // 남학생 = 1, 여학생 2
        for (int i = 0; i < students; i++) {
            st = new StringTokenizer(br.readLine());

            int gender = Integer.parseInt(st.nextToken());
            int number = Integer.parseInt(st.nextToken());  // 스위치 숫자

            if (gender == 1) {
                // 남학생이면 배수의 상태로 변경
                for(int j = 0; j < N; j++){
                    if((j + 1) % number ==0 ) arr[j] = arr[j] == 0 ? 1 : 0; 
                }
            } else {
                //여학생일 경우
                arr[number -1] = arr[number -1] == 0 ? 1 : 0;
                for(int j = 1; j < N / 2; j++){
                    if(number -1 + j >= N || number - 1 - j < 0) break;

                    if(arr[number - 1 - j] == arr[number -1 + j]){
                        arr[number - 1 - j] = arr[number - 1 - j] == 0 ? 1 : 0;
                        arr[number - 1 + j] = arr[number - 1 + j] == 0 ? 1 : 0; 
                    }else{
                        break;
                    }

                } 
            }
        }
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < N; i++){
            sb.append(arr[i]).append(" ");
            if((i + 1) % 20 == 0) sb.append("\n");
        }

        System.out.print(sb.toString());
    }
}
