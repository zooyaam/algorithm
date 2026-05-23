import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        List<String> list = new ArrayList<>(Arrays.asList(players));
        Map<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }
        
        for (String c : callings) {
            int idx = map.get(c);
            String p = list.get(idx - 1);
            
            list.set(idx - 1, c);
            list.set(idx, p);
            
            map.put(c, idx - 1);
            map.put(p, idx);
        }
        
        return list.toArray(new String[0]);
    }
}