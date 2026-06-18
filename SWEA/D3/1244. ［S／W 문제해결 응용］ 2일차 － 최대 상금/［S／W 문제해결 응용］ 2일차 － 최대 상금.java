import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
    static int max;
    static boolean[][] visited;
    
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
            char[] arr = sc.next().toCharArray();
            int limit = sc.nextInt();
            
            max = 0;
            visited = new boolean[limit+1][1000000];
            
            dfs(arr, limit);
            
            System.out.println("#" + test_case + " " + max);
		}
	}
    
    public static void dfs(char[] arr, int limit) {
        int num = Integer.parseInt(new String(arr));
        
        if (visited[limit][num]) return;
        visited[limit][num] = true;
        
        if (limit == 0) {
        	max = Math.max(max, num);
            return;
        }
        
        for (int i = 0; i < arr.length - 1; i++) {
        	for (int j = i + 1; j < arr.length; j++) {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                
            	dfs(arr, limit - 1);
                
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
}