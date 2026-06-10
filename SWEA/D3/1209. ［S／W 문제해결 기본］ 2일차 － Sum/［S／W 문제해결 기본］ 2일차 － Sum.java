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
            
            int[][] arr = new int[100][100];
            for (int i = 0; i < 100; i++) {
            	for (int j = 0; j < 100; j++) {
                	arr[i][j] = sc.nextInt();
                }
            }
            
            int max = Integer.MIN_VALUE;
            
            for (int i = 0; i < 100; i++) {
            	int rowSum = 0;
                int colSum = 0;
                
                for (int j = 0; j < 100; j++) {
                	rowSum += arr[i][j];
                    colSum += arr[j][i];
                }
                
                max = Math.max(max, rowSum);
                max = Math.max(max, colSum);
            }
            
            int diagSum1 = 0;
            int diagSum2 = 0;
            
            for (int i = 0; i < 100; i++) {
            	diagSum1 += arr[i][i];
                diagSum2 += arr[i][99-i];
            }
            
            max = Math.max(max, diagSum1);
            max = Math.max(max, diagSum2);
            
            System.out.println("#" + tnum + " " + max);
		}
	}
}