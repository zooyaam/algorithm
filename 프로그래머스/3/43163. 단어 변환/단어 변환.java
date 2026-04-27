class Solution {
    static int min = Integer.MAX_VALUE;
    
    public int solution(String begin, String target, String[] words) {
        boolean[] visited = new boolean[words.length];
        
        dfs(begin, target, words, visited, 0);
        
        return min == Integer.MAX_VALUE ? 0 : min;
        
    }
    
    public static void dfs(String curr, String target, String[] words, boolean[] visited, int cnt) {
        if (curr.equals(target)) {
            min = Math.min(min, cnt);
            return;
        }
        
        if (cnt >= min) return;
        
        for (int i = 0; i < words.length; i++) {
            if (visited[i] == true) continue;
            
            String word = words[i];
            
            int t = 0;
            for (int j = 0; j < word.length(); j++) {
                char c1 = curr.charAt(j);
                char c2 = word.charAt(j);
                
                if (c1 != c2) t++;
            }
            
            if (t == 1) {
                visited[i] = true;
                dfs(word, target, words, visited, cnt+1);
                visited[i] = false;
            }
        }
    }
}