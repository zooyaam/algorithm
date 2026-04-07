import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        // 캐시크기 예외처리
        if (cacheSize == 0) return cities.length * 5;
        
        Deque<String> cache = new LinkedList<>();
        
        int time = 0;
        
        for (int i = 0; i < cities.length; i++) {
            String city = cities[i].toLowerCase();
            
            if (cache.contains(city)) {
                // cache hit
                cache.remove(city);
                cache.addLast(city);
                time++;
            } else {
                // cache miss
                if (cache.size() == cacheSize) {
                    cache.remove();   
                }
                cache.addLast(city);
                time += 5;
            }
        }
        
        return time;
    }
}