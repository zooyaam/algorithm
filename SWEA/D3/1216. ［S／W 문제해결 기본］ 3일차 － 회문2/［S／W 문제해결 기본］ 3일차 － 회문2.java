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
            
            char[][] board = new char[100][100];
            for (int i = 0; i < 100; i++) {
            	String line = sc.next();
                for (int j = 0; j < 100; j++) board[i][j] = line.charAt(j);
            }
            
            int max = 1;
            
            // 행
            for (int i = 0; i < 100; i++) {
            	for (int j = 0; j < 100; j++) {
                    if (max == 100) break;
                    
                    // 홀수 길이 탐색
                    int left = j;
                    int right = j;
                    while (left >= 0 && right < 100 && board[i][left] == board[i][right]) {
                    	max = Math.max(max, right - left + 1);
                        left--;
                        right++;
                    }
                    
                    // 짝수 길이 탐색
                    left = j;
                    right = j + 1;
                    while (left >= 0 && right < 100 && board[i][left] == board[i][right]) {
                    	max = Math.max(max, right - left + 1);
                        left--;
                        right++;
                    }
                }
            }
            
            // 열
            for (int i = 0; i < 100; i++) {
            	for (int j = 0; j < 100; j++) {
                    if (max == 100) break;
                    
                    // 홀수 길이 탐색
                    int up = j;
                    int down = j;
                    while (up >= 0 && down < 100 && board[up][i] == board[down][i]) {
                    	max = Math.max(max, down - up + 1);
                        up--;
                        down++;
                    }
                    
                    // 짝수 길이 탐색
                    up = j;
                    down = j + 1;
                    while (up >= 0 && down < 100 && board[up][i] == board[down][i]) {
                    	max = Math.max(max, down - up + 1);
                        up--;
                        down++;
                    }
                }
            }
            
            System.out.println("#" + tnum + " " + max);
		}
	}
}