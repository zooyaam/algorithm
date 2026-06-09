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
            
            int[][] board = new int[100][100];
            int x = 0, y = 0;
            for (int i = 0; i < 100; i++) {
            	for (int j = 0; j < 100; j++) {
                	int n = sc.nextInt();
                    board[i][j] = n;
                    if (n == 2) {
                        y = i;
                        x = j;
                    }
                }
            }
            
            while (y != 0) {
                board[y][x] = 0;
                
                if (x > 0 && board[y][x-1] == 1) x--;
                else if (x < 99 && board[y][x+1] == 1) x++;
                else y--;
            }
            
            System.out.println("#" + tnum + " " + x);
		}
	}
}