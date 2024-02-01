import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class Test1181 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    //테스트 수
        //중복 제거를 위한 HashSet
        HashSet<String> hs = new HashSet<>();
        for(int i = 0; i < N; i++){
            hs.add(br.readLine());
        }

        //리스트 변환
        List<String> list = new ArrayList<>(hs);
        
        //정렬
        Collections.sort(list, Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder()));

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < list.size(); i++){
            sb.append(list.get(i)).append("\n");
        }
       
        System.out.print(sb.toString());


    }    
}
