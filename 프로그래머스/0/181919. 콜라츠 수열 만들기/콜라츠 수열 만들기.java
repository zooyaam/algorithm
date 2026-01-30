import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> collatz = new ArrayList<>();
        
        int x = n;
        collatz.add(x);
        
        while (x != 1) {
            if (x % 2 == 0) {
                x /= 2;
            } else {
                x = 3 * x + 1;
            }
            
            collatz.add(x);
        }
        
        return collatz.stream().mapToInt(Integer::intValue).toArray();
    }
}