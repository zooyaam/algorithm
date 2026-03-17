import java.util.HashSet;
import java.util.Set;

class Solution {
    Set<Integer> set = new HashSet<>();
    
    public int solution(String numbers) {
        String[] nums = numbers.split("");
        boolean [] visited = new boolean[nums.length];
        
        dfs(nums, visited, "");
        
        int cnt = 0;
        for (int num : set) {
            if (isPrime(num)) cnt++;
        }
        
        return cnt;
    }
    
    private void dfs(String[] nums, boolean[] visited, String current) {
        if (!current.equals("")) {
            set.add(Integer.parseInt(current));
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (visited[i]) continue;
            
            visited[i] = true;
            dfs(nums, visited, current + nums[i]);
            visited[i] = false;
        }
    }
    
    private boolean isPrime(int n) {
        if (n < 2) return false;
        
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        
        return true;
    }
}