import java.util.*;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		
		for(int test_case = 1; test_case <= 10; test_case++)
		{
            int l = sc.nextInt();
            String line = sc.next();
            
            int result = 0;
            
            for (int i = 0; i < l; i++) {
            	char c = line.charAt(i);
                
                if (c == '+') continue;
                result += c - '0';
            }
            
            System.out.println("#" + test_case + " " + result);
		}
	}
}