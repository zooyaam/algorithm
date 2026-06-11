import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
	
		for(int test_case = 1; test_case <= 10; test_case++)
		{
            int l = sc.nextInt();
            
            char arr[][] = new char[8][8];
            for (int i = 0; i < 8; i++) {
                String line = sc.next();
            	for (int j = 0; j < 8; j++) {
                	arr[i][j] = line.charAt(j);
                }
            }
            
            int result = 0;
            
            // 행
            for (int i = 0; i < 8; i++) {
            	for (int j = 0; j <= 8 - l; j++) {
                    boolean isRowPalindrome = true;
                    
                    int r = 0;
                    while (r < l / 2) {
                        if (arr[i][j+r] != arr[i][j+l-r-1]) {
                            isRowPalindrome = false;
                            break;
                        }
                    	r++;
                    }
                    
                    if (isRowPalindrome) result++;
                }
            }
            
            // 열
             for (int i = 0; i < 8; i++) {
            	for (int j = 0; j <= 8 - l; j++) {
                    boolean isColPalindrome = true;
                    
                    int c = 0;
                    while (c < l / 2) {
                    	if (arr[j+c][i] != arr[j+l-c-1][i]) {
                        	isColPalindrome = false;
                            break;
                        }
                        c++;
                    }
                    
                    if (isColPalindrome) result++;
                }
            }
            
            System.out.println("#" + test_case + " " + result);
		}
	}
}