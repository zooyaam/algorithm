import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
        Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
        
        // 우하좌상
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

		for(int test_case = 1; test_case <= T; test_case++)
		{
            int N = sc.nextInt();
            int[][] arr = new int[N][N];
            
            int x = 0;
            int y = 0;
            arr[x][y] = 1;
            
            int d = 0;
            for (int i = 2; i <= N * N; i++) {
                int nx = x + dx[d];
                int ny = y + dy[d];
                
                if (nx < 0 || nx >= N || ny < 0 || ny >= N || arr[nx][ny] != 0) {
                    d = (d + 1) % 4;
                    nx = x + dx[d];
                    ny = y + dy[d];
                }
                
                x = nx;
                y = ny;
                arr[x][y] = i;
            }
            
            System.out.println("#" + test_case);
            for (int i = 0; i < N; i++) {
            	for (int j = 0; j < N; j++) System.out.print(arr[i][j] + " ");
                System.out.println();
            }
		}
	}
}