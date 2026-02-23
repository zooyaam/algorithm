import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
        return Arrays.stream(my_string.trim().split(" "))
            .filter(s -> !s.isEmpty())
            .toArray(String[]::new);
    }
}