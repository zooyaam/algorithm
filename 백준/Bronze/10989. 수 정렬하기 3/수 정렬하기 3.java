import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        
        int N = Integer.parseInt(br.readLine());
        
        int[] nums = new int[10001];
        
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            nums[num]++;
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 1; i <= 10000; i++) {
            for (int j = 0; j < nums[i]; j++) {
                sb.append(i).append('\n');
            }
        }
        
        System.out.println(sb);
    }
}