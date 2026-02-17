class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int f_cnt = 0;
        for (boolean b : finished) {
            if (!b) f_cnt++;
        }
        
        String[] result = new String[f_cnt];
        
        int idx = 0;
        for (int i = 0; i < todo_list.length; i++) {
            if (!finished[i]) {
                result[idx] = todo_list[i];
                idx++;
            }
        }
        
        return result;
    }
}