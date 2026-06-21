import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
        
		int N = sc.nextInt();
        
        for (int i = 1; i <= N; i++) {
        	String s = Integer.toString(i);
            
            int cnt = 0;
            for (char c : s.toCharArray()) {
	            if (c == '3' || c == '6' || c == '9') cnt++;
            }
            
            if (cnt == 0) System.out.print(s);
            else for (int j = 0; j < cnt; j++) System.out.print("-");

            System.out.print(" ");
        }
	}
}