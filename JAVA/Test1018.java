import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1018 {

    private static boolean[][] board;
    private static int min = 64;    //8 * 8 칸이므로 최대 64 

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);

        board = new boolean[N][M];

        for(int i = 0; i < N; i++){
            String line = br.readLine();
            for(int j = 0; j < M; j++){
                if(line.charAt(j) == 'W'){
                    board[i][j] = true; //W이면 true
                }else{
                    board[i][j] = false;
                }
            }
        }

        for(int i = 0; i < N - 7; i++){
            for(int j = 0; j < M - 7; j++){
                 findBoard(i, j);
            }
        }
        System.out.println(min);
    }

    private static void findBoard(int x, int y){
        int end_x = x + 8;
        int end_y = y + 8;

        //첫번재 칸의 색
        boolean TF = board[x][y];
        int count = 0;
        for(int i = x; i < end_x; i++){
            for(int j = y; j < end_y; j++){
                if(board[i][j] != TF){
                    count++;
                }
                TF = (!TF);
            }
            TF = (!TF); //체스 칸의 열 또한 흰색 검은색 반복임
        }

        count = Math.min(count, 64-count);
        
        min = Math.min(count, min);
    }

}
