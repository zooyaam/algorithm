import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] solution(int n, String[] words) {
        Set<String> set = new HashSet<>();
        
        set.add(words[0]);
        
        for (int i = 1; i < words.length; i++) {
            String prev_word = words[i - 1];
            String word = words[i];
            
            char e = prev_word.charAt(prev_word.length() - 1);
            char s = word.charAt(0);
            
            if (e != s || set.contains(word)) return new int[]{i % n + 1, i / n + 1};
            
            set.add(word);
        }
        
        return new int[]{0, 0};
    }
}