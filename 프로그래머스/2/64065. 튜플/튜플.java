import java.util.*;

class Solution {
    public int[] solution(String s) {
        s = s.substring(2, s.length() - 2);
        
        String[] arr = s.split("\\},\\{");
        Arrays.sort(arr, (a, b) -> a.length() - b.length());
        
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        
        for (String str : arr) {
            String[] num = str.split(",");
            
            for (String n : num) {
                int v = Integer.parseInt(n);
                
                if (!set.contains(v)) {
                    set.add(v);
                    list.add(v);
                }
            }
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}