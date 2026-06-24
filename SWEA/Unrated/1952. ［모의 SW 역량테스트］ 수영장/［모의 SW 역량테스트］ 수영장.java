import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int[] fee = new int[4];
            for (int i = 0; i < 4; i++) fee[i] = sc.nextInt();
            
            int[] plan = new int[12];
            for (int i = 0; i < 12; i++) plan[i] = sc.nextInt();
            
            int[] dp = new int[12];
            dp[0] = Math.min(plan[0] * fee[0], fee[1]);
                      
            for (int i = 1; i < 12; i++) {
                dp[i] = Math.min(dp[i-1] + plan[i] * fee[0], dp[i-1] + fee[1]);
                
                if (i >= 3) dp[i] = Math.min(dp[i], dp[i-3] + fee[2]);
                else dp[i] = Math.min(dp[i], fee[2]);
            }
            
            dp[11] = Math.min(dp[11] , fee[3]);
            
            System.out.println("#" + test_case + " " + dp[11]);
		}
	}
}