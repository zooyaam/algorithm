class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        for (int i = 0; i < my_strings.length; i++) {
            int s = parts[i][0];
            int e = parts[i][1];
            
            my_strings[i] = my_strings[i].substring(s, e+1);
        }
        
        return String.join("", my_strings);
    }
}