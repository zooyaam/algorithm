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
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) arr[i] = sc.nextInt();
            
            int max = 0;
            long profit = 0;
            for (int i = N-1; i >= 0; i--) {
                int cost = arr[i];
            	if (cost > max) max = cost;
                else profit += (max - cost);
            }
            
            System.out.println("#" + test_case + " " + profit);
		}
	}
}