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
            int A = sc.nextInt();
            int B = sc.nextInt();
            
            int time = A + B;
            while (time >= 24) time -= 24;
            
			System.out.println("#" + test_case + " " + time);
		}
	}
}