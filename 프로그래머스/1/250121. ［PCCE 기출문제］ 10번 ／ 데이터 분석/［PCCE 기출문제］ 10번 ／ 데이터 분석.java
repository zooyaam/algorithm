import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        Map<String, Integer> map = new HashMap<>();
        map.put("code", 0);
        map.put("date", 1);
        map.put("maximum", 2);
        map.put("remain", 3);
        
        int extIdx = map.get(ext);
        int sortIdx = map.get(sort_by);
        
        List<int[]> list = new ArrayList<>();
        for (int[] row : data) {
            if (row[extIdx] < val_ext) list.add(row);
        }
        
        Collections.sort(list, (a, b) -> Integer.compare(a[sortIdx], b[sortIdx]));
        
        int[][] result = new int[list.size()][4];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        
        return result;
    }
}