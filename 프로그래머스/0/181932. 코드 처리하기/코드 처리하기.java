class Solution {
    public String solution(String code) {
        int mode = 0;
        StringBuilder ret = new StringBuilder();
        
        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);
            
            if (c == '1') {
                mode = 1 - mode;
                continue;
            }
            
            if ((mode == 0 && i % 2 == 0) || (mode == 1 && i % 2 == 1)) {
                ret.append(c);
            }
        }
        
        return ret.length() > 0 ? ret.toString() : "EMPTY";
    }
}