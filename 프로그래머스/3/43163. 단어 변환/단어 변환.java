import java.util.*;

class Solution {
    class Node {
        String word;
        int cnt;
        
        Node(String word, int cnt) {
            this.word = word;
            this.cnt = cnt;
        }
    }
    
    public int solution(String begin, String target, String[] words) {
        Queue<Node> q = new LinkedList<>();
        boolean[] visited = new boolean[words.length];
        
        q.offer(new Node(begin, 0));
        
        while (!q.isEmpty()) {
            Node curr = q.poll();
            if (curr.word.equals(target)) return curr.cnt;
            
            for (int i = 0; i < words.length; i++) {
                if (visited[i]) continue;
                
                int t = 0;
                
                for (int j = 0; j < words[i].length(); j++) {
                    char c1 = curr.word.charAt(j);
                    char c2 = words[i].charAt(j);
                    
                    if (c1 != c2) t++;
                }
                
                if (t == 1) {
                    visited[i] = true;
                    q.offer(new Node(words[i], curr.cnt + 1));
                }
            }
        }
        
        return 0;
    }
}