import java.util.*;

class Solution {
    HashMap<String, Integer> map = new HashMap<>();
    
    public String[] solution(String[] orders, int[] course) {
        // 주문 문자열 정렬
        for (int i = 0; i < orders.length; i++) {
            char[] arr = orders[i].toCharArray();
            Arrays.sort(arr);
            orders[i] = String.valueOf(arr);
        }
        
        List<String> result = new ArrayList<>();
        
        for (int c : course) {
            for (String o : orders) {
                dfs(c, o, "", 0);
            }
            
            // 길이별 최댓값(2회 이상) 반환
            int max = 2;
            List<String> candidate = new ArrayList<>();
            
            for (String key : map.keySet()) {
                if (max == map.get(key)) {
                    candidate.add(key);
                }
                
                if (max < map.get(key)) {
                    max = map.get(key);
                    candidate.clear();
                    candidate.add(key);
                }
            }
            
            for (String s : candidate) {
                result.add(s);
            }
            map.clear();
        }
        
        Collections.sort(result);
        
        return result.toArray(new String[0]);
    }
    
    public void dfs(int cnt, String o, String comb, int idx) {
        // 조합이 완성되면 갯수 추가, 종료
        if (cnt == 0) {
            map.put(comb, map.getOrDefault(comb, 0) + 1);
            return;
        }
        
        for (int i = idx; i < o.length(); i++) {
            char c = o.charAt(i);
            dfs(cnt - 1, o, comb + c, i + 1);
        }
    }
}