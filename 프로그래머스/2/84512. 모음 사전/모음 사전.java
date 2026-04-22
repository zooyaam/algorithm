class Solution {
    public int solution(String word) {
        char[] alph = {'A', 'E', 'I', 'O', 'U'};
        
        int cnt = 0;
        
        for (int i = 0; i < 5; i++) {
            String w1 = "" + alph[i];
            cnt++;
            
            if (w1.equals(word)) return cnt;
            
            for (int j = 0; j < 5; j++) {
                String w2 = w1 + alph[j];
                cnt++;
                
                if (w2.equals(word)) return cnt;
                
                for (int k = 0; k < 5; k++) {
                    String w3 = w2 + alph[k];
                    cnt++;
                    
                    if (w3.equals(word)) return cnt;
                    
                    for (int l = 0; l < 5; l++) {
                        String w4 = w3 + alph[l];
                        cnt++;
                        
                        if (w4.equals(word)) return cnt;
                        
                        for (int m = 0; m < 5; m++) {
                            String w5 = w4 + alph[m];
                            cnt++;
                            
                            if (w5.equals(word)) return cnt;
                        }
                    }
                }
            }
        }
        
        return cnt;
    }
}