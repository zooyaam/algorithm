import java.util.*;

class Solution {
    public int solution(String dirs) { 
        Set<String> set = new HashSet<>();
        
        int[] pos = new int[]{5, 5};
        int cnt = 0;
        
        for (char dir : dirs.toCharArray()) {
            int prevX = pos[0];
            int prevY = pos[1];
            int nextX = pos[0];
            int nextY = pos[1];
            
            switch (dir) {
                case 'U' :
                    if (pos[0] == 0) continue;
                    nextX += -1;
                    break;
                case 'D' :
                    if (pos[0] == 10) continue;
                    nextX += 1;
                    break;
                case 'R' :
                    if (pos[1] == 10) continue;
                    nextY += 1;
                    break;
                case 'L' :
                    if (pos[1] == 0) continue;
                    nextY += -1;
                    break;
            }
            
            String path1 = prevX + "," + prevY + "," + nextX + "," + nextY;
            String path2 = nextX + "," + nextY + "," + prevX + "," + prevY;
            
            if (!set.contains(path1)) {
                cnt++;
                set.add(path1);
                set.add(path2);
            }
            
            pos[0] = nextX;
            pos[1] = nextY;
        }
        
        return cnt;
    }
}