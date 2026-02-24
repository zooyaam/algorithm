class Solution {
    public int solution(String myString, String pat) {
        String str = myString.replace("A", "C")
            .replace("B", "A")
            .replace("C", "B");
        
        return str.contains(pat) ? 1 : 0;
    }
}