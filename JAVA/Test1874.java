import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Test1874 {
    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int a = Integer.parseInt(br.readLine());
        
        int num = 1;
        int[] arr = new int[a];
        for(int i=0; i<a; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        Boolean result = true;
        for(int i=0; i<a; i++){
        int su = arr[i];
           if(su >= num){
               while(su >= num ){
                 stack.push(num++);
                   sb.append("+").append("\n");
               }
               stack.pop();
               sb.append("-").append("\n");
           } else{
                int k = stack.pop();
               if(k != su){
                   System.out.println("NO");
                   result = false;
                   break;
               }else{
               sb.append("-").append("\n"); 
               }
           }
           
        }
        
        if(result){
            System.out.println(sb);
        }
        
    } // main
}
