import java.util.*;

class Solution {
    Set<String> set = new HashSet<>();
    
    long minX = Long.MAX_VALUE;
    long minY = Long.MAX_VALUE;
    long maxX = Long.MIN_VALUE;
    long maxY = Long.MIN_VALUE;
    
    public String[] solution(int[][] line) {
        for (int i = 0; i < line.length - 1; i++) {
            for (int j = i + 1; j < line.length; j++) {
                intersection(line[i], line[j]);
            }
        }
        
        int leng = (int) (maxY - minY + 1);
        String[] result = new String[leng];
        
        long y = maxY;
        
        for (int i = 0; i < leng; i++) {
            StringBuilder sb = new StringBuilder();
            
            for (long x = minX; x <= maxX; x++) {
                if (set.contains(x + "," + y)) sb.append("*");
                else sb.append(".");
            }
            
            result[i] = sb.toString();
            y--;
        }
        
        return result;
    }
    
    public void intersection(int[] l1, int[] l2) {        
        long denom = (long) l1[0] * l2[1] - (long) l1[1] * l2[0];
        if (denom == 0) return;
        
        long xNumer = (long) l1[1] * l2[2] - (long) l1[2] * l2[1];
        long yNumer = (long) l1[2] * l2[0] - (long) l1[0] * l2[2];
        if (xNumer % denom != 0 || yNumer % denom != 0) return;
        
        long x = xNumer / denom;
        long y = yNumer / denom;
        
        set.add(x + "," + y);
        
        minX = Math.min(minX, x);
        minY = Math.min(minY, y);
        
        maxX = Math.max(maxX, x);
        maxY = Math.max(maxY, y);
    }
}