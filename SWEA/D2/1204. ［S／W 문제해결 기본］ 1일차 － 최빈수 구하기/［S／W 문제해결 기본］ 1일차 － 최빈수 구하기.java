import java.util.*;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int tnum = sc.nextInt();
            
            // 작은 범위에서는 Map보다 배열이 더 좋은 선택!
            int arr[] = new int[101];
            
            int i = 0;
            while (i < 1000) {
            	int n = sc.nextInt();
                arr[n]++;
                i++;
            }
            
            int maxCnt = 0;
            int maxNum = 0;
            
            int j = 0;
            while (j < 101) {
                if (arr[j] >= maxCnt) {
                	maxCnt = arr[j];
                    maxNum = j;
                }
                j++;
            }
            
            System.out.println("#"+ tnum + " " + maxNum);
		}
	}
}