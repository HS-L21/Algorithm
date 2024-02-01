import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1543 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();
        String word = br.readLine();

        int cnt = countOccurrences(line, word);

        System.out.print(cnt);
    }

    private static int countOccurrences(String line, String word) {
        int cnt = 0;
        int wordLength = word.length();

        for (int i = 0; i <= line.length() - wordLength; i++) {
            if (line.substring(i, i + wordLength).equals(word)) {
                cnt++;
                i += wordLength - 1; 
            }
        }

        return cnt;
    
    }
}
