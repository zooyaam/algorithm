import java.util.Arrays;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        Integer[] students = new Integer[rank.length];
        
        for (int i = 0; i < rank.length; i++) {
            students[i] = i;
        }
        
        Arrays.sort(students, (a, b) -> rank[a] - rank[b]);
        
        int count = 0;
        int a = 0, b = 0, c = 0;

        for (int s : students) {
            if (attendance[s]) {
                if (count == 0) a = s;
                else if (count == 1) b = s;
                else if (count == 2) {
                    c = s;
                    break;
                }
                count++;
            }
        }
        
        return 10000 * a + 100 * b + c;
    }
}