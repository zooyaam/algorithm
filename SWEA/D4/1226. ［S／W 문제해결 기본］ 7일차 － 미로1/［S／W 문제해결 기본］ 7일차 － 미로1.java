import java.util.*;
import java.io.FileInputStream;

class Solution
{
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
        
		for(int test_case = 1; test_case <= 10; test_case++)
		{
            int tnum = sc.nextInt();
            
            int[] start = new int[2];
            int[] end = new int[2];
            
            int[][] maze = new int[16][16];
            for (int i = 0; i < 16; i++) {
                String line = sc.next();
            	for (int j = 0; j < 16; j++) {
                    int n = line.charAt(j) - '0';
                	maze[i][j] = n;
                    
                    if (n == 2) {
                    	start[0] = i;
                        start[1] = j;
                    } else if (n == 3) {
                    	end[0] = i;
                        end[1] = j;
                    }
                }
            }
            
            boolean[][] visited = new boolean[16][16];
            int result = dfs(maze, visited, start[0], start[1], end);
            
            // 가능 1, 불가 0
            System.out.println("#" + tnum + " " + result);
		}
	}
    
    public static int dfs (int[][] maze, boolean[][] visited, int x, int y, int[] end) {
    	if (x < 0 || y < 0 || x > 15 || y > 15) return 0;
        
        if (maze[x][y] == 1 || visited[x][y]) return 0;
        
        if (x == end[0] && y == end[1] ) return 1;
        
        visited[x][y] = true;
        for (int i = 0; i < 4; i++) {
        	int nx = x + dx[i];
            int ny = y + dy[i];
            
            if (dfs(maze, visited, nx, ny, end) != 0) return 1;
        }
        
        return 0;
    }
}