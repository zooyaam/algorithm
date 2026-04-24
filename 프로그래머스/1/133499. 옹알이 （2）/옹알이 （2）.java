class Solution {
    public int solution(String[] babbling) {
        int cnt = 0;
        
        for (String str : babbling) {
            // 발음 연속 확인
            String prev = "";
            
            int i = 0;
            int l = str.length();
            while (i < l) {
                if (!prev.equals("aya") && i + 3 <= l && str.substring(i, i+3).equals("aya")) {
                    i += 3;
                    prev = "aya";
                } else if (!prev.equals("ye") && i + 2 <= l && str.substring(i, i+2).equals("ye")) {
                    i += 2;
                    prev = "ye";
                } else if (!prev.equals("woo") && i + 3 <= l && str.substring(i, i+3).equals("woo")) {
                    i += 3;
                    prev = "woo";
                } else if (!prev.equals("ma") && i + 2 <= l && str.substring(i, i+2).equals("ma")) {
                    i += 2;
                    prev = "ma";
                } else break;
            }
            
            if (i == l) cnt++;
        }
        
        return cnt;
    }
}