class Solution {
    public int solution(int n, int[][] computers) {
        boolean[] visited = new boolean[n];
        int network = 0;
        
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(i, visited, computers);
                network++;
            }
        }
        
        return network;
    }
    
    private void dfs(int i, boolean[] visited, int[][] coms) {
        int[] com = coms[i];
        
        for (int j = 0; j < coms.length; j++) {
            if (com[j] == 1 && !visited[j]) {
                visited[i] = true;
                dfs(j, visited, coms);
            }
        }
    }
}