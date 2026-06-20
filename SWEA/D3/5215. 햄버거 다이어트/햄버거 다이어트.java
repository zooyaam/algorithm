import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
    static class Ing {
    	int t;  // 점수
        int k;  // 칼로리
        
        Ing(int t, int k) {
        	this.t = t;
            this.k = k;
        }
    }
    
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int N = sc.nextInt();  // 재료 수
            int L = sc.nextInt();  // 제한 칼로리
            
            Ing[] arr = new Ing[N];
            for (int i = 0; i < N; i++) {
            	int t = sc.nextInt();
                int k = sc.nextInt();
                
                arr[i] = new Ing(t, k);
            }
            
            int[] dp = new int[L+1];
            for (int i = 0; i < N; i++) {
            	int t = arr[i].t;
                int k = arr[i].k;
                
                for (int j = L; j >= k; j--) {
                	dp[j] = Math.max(dp[j], dp[j-k] + t);
                }
            }
            
            int max = 0;
            for (int i = 1; i <= L; i++) max = Math.max(max, dp[i]);
            
            System.out.println("#" + test_case + " " + max);
		}
	}
}