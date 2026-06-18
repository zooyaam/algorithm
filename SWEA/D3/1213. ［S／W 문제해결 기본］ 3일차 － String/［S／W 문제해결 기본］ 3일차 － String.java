import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		for(int test_case = 1; test_case <= 10; test_case++)
		{
            int tnum = sc.nextInt();
            String target = sc.next();
            String str = sc.next();
            
            int result = (str.length() - str.replace(target, "").length()) / target.length();
            
            System.out.println("#" + tnum + " " + result);
		}
	}
}