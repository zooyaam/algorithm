class Solution {
    public int solution(String s) {
        int l = s.length();
        
        int min = l;
        
        for (int p = l / 2; p > 0; p--) {
            StringBuilder sb = new StringBuilder();
            
            String str = s.substring(0, p);
            int cnt = 1;
            
            int i;
            for (i = p; i + p <= l; i += p) {
                String sub = s.substring(i, i+p);
                
                if (str.equals(sub)) cnt++;
                else {
                    if (cnt > 1) sb.append(cnt);
                    sb.append(str);
                    
                    str = sub;
                    cnt = 1;
                }
            }
            
            if (cnt > 1) sb.append(cnt);
            sb.append(str);
            
            if (i < l) sb.append(s.substring(i));
            
            min = Math.min(min, sb.length());
        }
        
        return min;
    }
}