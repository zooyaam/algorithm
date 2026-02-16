import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        List<String> list = Arrays.asList(str_list);
        
        int l_idx = list.indexOf("l");
        int r_idx = list.indexOf("r");
        
        if (l_idx < 0 && r_idx < 0) return new String[]{};
        
        if (r_idx < 0 || (l_idx != -1 && l_idx < r_idx)) {
            return list.subList(0, l_idx).toArray(new String[0]);
        }
        
        return list.subList(r_idx+1, list.size()).toArray(new String[0]);   
    }
}