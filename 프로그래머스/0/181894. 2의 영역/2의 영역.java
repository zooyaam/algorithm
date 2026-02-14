import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        
        for (int num : arr) {
            list.add(num);
        }
        
        int s = list.indexOf(2);
        int e = list.lastIndexOf(2);
        
        if (s < 0) return new int[]{-1};
        
        return  Arrays.copyOfRange(arr, s, e + 1);
    }
}