import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int a, int b, int c) {
        Set<Integer> set = new HashSet<>();
        set.add(a);
        set.add(b);
        set.add(c);
        
        if (set.size() == 1) return (int) (27 * Math.pow(a, 6));
        if (set.size() == 2) return (a + b + c) * (a * a + b * b + c * c);
        return a + b + c;
    }
}