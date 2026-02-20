class Solution {
    public String solution(String myString) {
        char[] arr = myString.toCharArray();
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'a') {
                arr[i] = Character.toUpperCase(arr[i]);
            } else if (arr[i] != 'A') {
                arr[i] = Character.toLowerCase(arr[i]);
            }
        }
        
        return new String(arr);
    }
}