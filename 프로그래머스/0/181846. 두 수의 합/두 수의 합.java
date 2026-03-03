class Solution {
    public String solution(String a, String b) {
        StringBuilder result = new StringBuilder();
        
        int ai = a.length() - 1;
        int bi = b.length() - 1;
        int carry = 0;
        
        while (ai >= 0 || bi >= 0 || carry > 0) {
            int n1 = ai >= 0 ? a.charAt(ai) - '0' : 0;
            int n2 = bi >= 0 ? b.charAt(bi) - '0' : 0;
            
            int sum = n1 + n2 + carry;
            carry = 0;
            
            if (sum > 9) {
                carry = 1;
                sum %= 10; 
            }
            
            result.append(sum);
            
            ai--;
            bi--;
        }
        
        return result.reverse().toString();
    }
}