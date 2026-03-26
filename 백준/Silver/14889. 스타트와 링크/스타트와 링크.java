import java.io.*;
import java.util.*;

public class Main {
    static int min = Integer.MAX_VALUE;
    
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        
        int N = Integer.parseInt(br.readLine());
        
        StringTokenizer st;
        
        // 능력치 배열 s 생성
        int[][] s = new int[N][N];
        
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                s[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        int cnt = 0;
        boolean[] selected = new boolean[N];
        
        selected[0] = true;
        dfs(1, 1, selected, N, s);
        
        System.out.println(min);
        
    }
    
    private static void dfs (int cnt, int start, boolean[] selected, int N, int[][] s) {
        // 두 팀으로 나눠졌을 경우
        if (cnt == N/2) {
            int startTeam = 0;
            int linkTeam = 0;
            
            // 점수 합산
            for (int i = 0; i < N; i++) {
                for (int j = i+1; j < N; j++) {
                    if (selected[i] && selected[j]) {
                        startTeam += s[i][j] + s[j][i];
                    } else if (!selected[i] && !selected[j]) {
                        linkTeam += s[i][j] + s[j][i];
                    }
                }
            }
            
            // 최저점 갱신
            min = Math.min(min, Math.abs(startTeam - linkTeam));
            return;
        }
        
        for (int i = start; i < N; i++) {
            selected[i] = true;
            dfs(cnt + 1, i + 1, selected, N, s);
            
            selected[i] = false;
        }
    }
}