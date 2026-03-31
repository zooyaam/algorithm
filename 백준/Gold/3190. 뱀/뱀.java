import java.io.*;
import java.util.*;

public class Main {
    // 우 하 좌 상!
    static int[] dx = new int[]{0, 1, 0, -1};
    static int[] dy = new int[]{1, 0, -1, 0};
    static int currDir = 0;
    
    static int second = 0;
    
    static class Turn {
        int time;
        char dir;
        
        Turn(int time, char dir) {
            this.time = time;
            this.dir = dir;
        }
    }
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        
        // 보드
        int N = Integer.parseInt(br.readLine());
        int[][] board = new int[N][N];
        
        // 사과 위치 저장
        int K = Integer.parseInt(br.readLine());

        StringTokenizer st;
        
        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            
            int row = Integer.parseInt(st.nextToken()) - 1;
            int col = Integer.parseInt(st.nextToken()) - 1;
            
            board[row][col] = 1;
        }
        
        // 방향 전환 정보 저장
        int L = Integer.parseInt(br.readLine());
        Queue<Turn> q = new ArrayDeque<>();
        
        for (int i = 0; i < L; i++) {
            st = new StringTokenizer(br.readLine());
            
            int sec = Integer.parseInt(st.nextToken());
            char dir = st.nextToken().charAt(0);
            
            q.offer(new Turn(sec, dir));
        }
        
        // 뱀 위치 저장
        Deque<int[]> snake = new ArrayDeque<>();
        snake.addLast(new int[]{0, 0});
        board[0][0] = 2;
        
        while (true) {
            second++;
            
            int[] head = snake.peekLast();
            int nx = head[0] + dx[currDir];
            int ny = head[1] + dy[currDir];
            
            // 벽에 부딪히면 종료
            if (nx < 0 || ny < 0 || nx >= N || ny >= N) break;
            
            // 몸통과 부딪히면 종료
            if (board[nx][ny] == 2) break;
            
            // 이동
            snake.addLast(new int[]{nx, ny});
            
            if (board[nx][ny] == 1) {
                board[nx][ny] = 2;
            } else {
                board[nx][ny] = 2;
                
                int[] tail = snake.removeFirst();
                board[tail[0]][tail[1]] = 0;
            }
            
            
            // 방향 전환
            if (!q.isEmpty() && q.peek().time == second) {
                Turn t = q.poll();
                
                if (t.dir == 'D') {
                    currDir = (currDir + 1) % 4;
                } else {
                    currDir = (currDir + 3) % 4;
                }
            }
        }
        
        System.out.print(second);
    }
}