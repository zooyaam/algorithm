class Solution {
    public int solution(String s) {
        int result = 0;
        
        char x = s.charAt(0);
        int x_cnt = 1, o_cnt = 0;
        
        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (x == c) {
                x_cnt++;
            } else {
                o_cnt++;
            }
            
            if (x_cnt == o_cnt) {
                result++;
                
                if (i != s.length() - 1) {
                    x = s.charAt(i+1);
                    x_cnt = 0;
                    o_cnt = 0;
                }
            }
        }
        
        if (x_cnt != o_cnt) result++;
        
        return result;
    }
}