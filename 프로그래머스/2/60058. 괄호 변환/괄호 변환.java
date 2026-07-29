class Solution {
    public String solution(String p) {
        return func(p);
    }
    
    public String func(String w) {
        if (w.equals("")) return "";
        
        StringBuilder sb = new StringBuilder();
        
        // 균형 잡힌 문자열 u와 v로 분리
        String[] uv = separate(w);
        String u = uv[0];
        String v = uv[1];
        
        // u가 올바른 괄호 문자열인지 검사
        if (isProper(u)) {
            sb.append(u);
            sb.append(func(v));
        } 
        else {
            sb.append("(");
            sb.append(func(v));
            sb.append(")");
            
            StringBuilder u2 = new StringBuilder();
            for (int i = 1; i < u.length() - 1; i++) {
                u2.append(u.charAt(i) == '(' ? ')' : '(');
            }
            sb.append(u2);
        }
        
        return sb.toString();
    }
    
    public boolean isProper(String u) {
        int cnt = 0;
        
        for (char ch : u.toCharArray()) {
            if (ch == '(') cnt++;
            if (ch == ')') cnt--;
            
            if (cnt < 0) return false;
        }
        
        return cnt == 0;
    }
    
    public String[] separate(String w) {
        int o = 0; 
        int c = 0;
        
        for (char ch : w.toCharArray()) {
            if (ch == '(') o++;
            if (ch == ')') c++;
            
            if (o == c) break;
        }
        
        String[] uv = {
            w.substring(0, o + c),
            w.substring(o + c)
        };
        
        return uv;
    }
}