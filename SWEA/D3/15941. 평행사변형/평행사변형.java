import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();
		
		for(int test_case = 1; test_case <= TC; test_case++)
		{
            int N = sc.nextInt();
            System.out.println("#" + test_case + " " + N*N);
		}
	}
}