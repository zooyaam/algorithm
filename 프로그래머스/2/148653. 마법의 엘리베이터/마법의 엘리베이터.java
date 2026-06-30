class Solution {
    public int solution(int storey) {
        int result = 0;
        
        while (storey > 0) {
            int d = storey % 10;
            storey /= 10;
            
            if (d > 5) {
                result += 10 - d;
                storey++;
            } else if (d < 5) {
                result += d;
            } else {
                if (storey % 10 >= 5) {
                    result += 5;
                    storey++;
                } 
                else result += 5;
            }
        }
        
        return result;
    }
}