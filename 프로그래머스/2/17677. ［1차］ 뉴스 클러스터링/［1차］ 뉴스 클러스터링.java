import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        Set<String> set = new HashSet<>();
        
        // 대소문자 통일
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        
        for (int i = 0; i < str1.length() - 1; i++) {
            char c1 = str1.charAt(i);
            char c2 = str1.charAt(i+1);
            
            if (c1 >= 'a' && c1 <= 'z' && c2 >= 'a' && c2 <= 'z') {
                String s = "" + c1 + c2;
                map1.put(s, map1.getOrDefault(s, 0) + 1);
                set.add(s);
            }
        }
        
        for (int i = 0; i < str2.length() - 1; i++) {
            char c1 = str2.charAt(i);
            char c2 = str2.charAt(i+1);
            
            if (c1 >= 'a' && c1 <= 'z' && c2 >= 'a' && c2 <= 'z') {
                String s = "" + c1 + c2;
                map2.put(s, map2.getOrDefault(s, 0) + 1);
                set.add(s);
            }
        }
        
        // 자카드 유사도 계산  
        int intersection = 0;
        int union = 0;
        
        for (String s : set) {
            int v1 = map1.getOrDefault(s, 0);
            int v2 = map2.getOrDefault(s, 0);
            
            intersection += Math.min(v1, v2); // 교집합
            union += Math.max(v1, v2); // 합집합
        }
        
        // 공집합 처리
        if (union == 0) return 65536;
        
        return (int) ((double) intersection / union * 65536);
    }
}