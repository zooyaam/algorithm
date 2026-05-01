import java.util.*;

class Solution {
    public int[] solution(String msg) {
        // 1. 사전 초기화 (A~Z)
        Map<String, Integer> dict = new HashMap<>();
        
        for (int i = 1; i < 27; i++) {
            String w = String.valueOf((char)(64 + i));
            dict.put(w, i);
        }
        
        // [2~4 반복]
        List<Integer> result = new ArrayList<>();
        
        int idx = 27;
        int i = 0;
        
        while (i < msg.length()) {
            // 2. 가장 긴 문자열 w 추출
            int j = i + 1;
            while (j <= msg.length() && dict.containsKey(msg.substring(i, j))) {
                j++;
            }
            
            String w = msg.substring(i, j - 1);
            
            // 3. w의 색인번호 등록, 입력에서 w제거
            result.add(dict.get(w));
            
            // 4. w+c 사전에 등록
            if (j <= msg.length()) {
                dict.put(msg.substring(i, j), idx);
                idx++;
            }
            
            i += w.length();
        }
        
        // 5. 색인번호 배열 출력
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}