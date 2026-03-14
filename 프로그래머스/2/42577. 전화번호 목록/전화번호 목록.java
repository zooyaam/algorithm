import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean solution(String[] phone_book) {
        Set<String> set = new HashSet<>();
        
        for (String num : phone_book) set.add(num);
        
        for (String num : set) {
            for (int i = 1; i < num.length(); i++) {
                String prefix = num.substring(0, i);
                
                if (set.contains(prefix)) return false;
            }
        }
        
        return true;
    }
}