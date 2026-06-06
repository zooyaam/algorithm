import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);

		for(int test_case = 1; test_case <= 10; test_case++)
		{
            int N = sc.nextInt();
            
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) arr[i] = sc.nextInt();
            
            int result = 0;
            for (int i = 0; i < N; i++) {
                int curr = arr[i];
                
                int max = 0;
                for (int j = i - 2; j < i + 3; j++) {
                    if (j < 0 || j >= N || j == i) continue;
                    max = Math.max(max, arr[j]);
                }
                
                if (max < curr) result += curr - max;
            }
            
            System.out.println("#" + test_case + " " + result);
		}
	}
}