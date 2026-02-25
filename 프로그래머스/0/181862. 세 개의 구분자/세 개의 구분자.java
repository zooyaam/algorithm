import java.util.Arrays;

class Solution {
    public String[] solution(String myStr) {
        String[] arr = myStr.replace("a", "c")
            .replace("b", "c")
            .split("c");
        
        String[] result = Arrays.stream(arr)
            .filter(s -> !s.isEmpty())
            .toArray(String[]::new);
        
        return result.length > 0 ? result : new String[]{"EMPTY"};
    }
}