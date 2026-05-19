class Solution {
    public String solution(String X, String Y) {
        // 0~9
        int[] x = new int[10];
        int[] y = new int[10];
        
        for (char c : X.toCharArray()) {
            int i = c - '0';
            x[i]++;
        }
        
        for (char c : Y.toCharArray()) {
            int i = c - '0';
            y[i]++;
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 9; i >= 0; i--) {
            int min = Math.min(x[i], y[i]);
            
            for (int j = 0; j < min; j++) {
                sb.append(i);
            }
        }
        
        if (sb.length() == 0) return "-1";
        if (sb.charAt(0) == '0') return "0";
        return sb.toString();
    }
}