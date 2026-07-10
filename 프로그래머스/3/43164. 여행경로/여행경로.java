import java.util.*;

class Solution {
    List<String[]> routes = new ArrayList<>();
    
    public String[] solution(String[][] tickets) {
        int cnt = 0;
        
        for (int i = 0; i < tickets.length; i++) {
            if (!tickets[i][0].equals("ICN")) continue;
            
            String[] route = new String[tickets.length + 1];
            boolean[] visited = new boolean[tickets.length];
            
            visited[i] = true;
            route[0] = "ICN";
            route[1] = tickets[i][1];
            
            dfs(tickets, tickets[i][1], 2, route, visited);
        }
        
        // 경로 사전순 정렬
        Collections.sort(routes, (a, b) -> {
            for (int i = 0; i < a.length; i++) {
                int t = a[i].compareTo(b[i]);
                
                if (t != 0) return t;
            }
            
            return 0;
        });
        
        return routes.get(0);
    }
    
    public void dfs(String[][] tickets, String airport, int cnt, String[] route, boolean[] visited) {
        if (cnt == route.length) {
            routes.add(route.clone());
            return;
        }
        
        for (int i = 0 ; i < tickets.length; i++) {
            if (tickets[i][0].equals(airport) && !visited[i]) {
                visited[i] = true;
                route[cnt] = tickets[i][1];
                
                dfs(tickets, tickets[i][1], cnt + 1, route, visited);
                
                // 백트래킹
                visited[i] = false;
                route[cnt] = null;
            } 
        }
    }
}