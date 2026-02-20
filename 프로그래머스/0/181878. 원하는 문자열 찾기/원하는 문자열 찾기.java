class Solution {
    public int solution(String myString, String pat) {
        String str = myString.toLowerCase();
        
        return str.contains(pat.toLowerCase()) ? 1 : 0;
    }
}