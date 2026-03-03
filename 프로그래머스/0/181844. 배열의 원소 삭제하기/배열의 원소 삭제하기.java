import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        
        for (int n : delete_list) {
            set.add(n);
        }
        
        for (int num : arr) {
            if (!set.contains(num)) list.add(num);
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}