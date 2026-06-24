import java.util.*;
import java.io.FileInputStream;

class Solution
{
    static class Node {
        int x, y, dist;
        
        Node(int x, int y, int d) {
            this.x = x;
            this.y = y;
            this.dist = d;
        }
    }
    
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
        for(int test_case = 1; test_case <= T; test_case++)
		{
            int N = sc.nextInt();
            
            int[][] board = new int[N][N];
            for (int i = 0; i < N; i++) {
                String line = sc.next();
            	for (int j = 0; j < N; j++) board[i][j] = line.charAt(j) - '0';
            }
            
            PriorityQueue<Node> pq = new PriorityQueue<>((a,  b) -> a.dist - b.dist);
            pq.offer(new Node(0, 0, 0));
            
            int[][] dist = new int[N][N];
            for (int i = 0; i < N; i++) Arrays.fill(dist[i], Integer.MAX_VALUE);
            dist[0][0] = 0;
            
            // 상하좌우
            int[] dx = {0, 0, -1, 1};
            int[] dy = {-1, 1, 0, 0};
            
            while (!pq.isEmpty()) {
            	Node curr = pq.poll();
                int x = curr.x;
                int y = curr.y;
                
                if (curr.dist > dist[x][y]) continue;
                
                // 인접노드 조사
                for (int d = 0; d < 4; d++) {
                	int nx = x + dx[d];
                    int ny = y + dy[d];
                    
                    if (nx < 0 || ny < 0 || nx >= N || ny >= N) continue;
                    
                    int newDist = dist[x][y] + board[nx][ny];
                    
                    if (dist[nx][ny] > newDist) {
                    	dist[nx][ny] = newDist;
                        pq.offer(new Node(nx, ny, newDist));
                    }
                }
            }
            
            System.out.println("#" + test_case + " " + dist[N-1][N-1]);
        }
	}
}