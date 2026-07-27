class Solution {
    public int[] solution(String[][] places) {
        int[] result = new int[5];
        
        for (int i = 0; i < 5; i++) {
            String[] place = places[i];
            result[i] = isValid(place) ? 1 : 0;
        }
        
        return result;
    }
    
    public boolean isValid(String[] place) {
        // 맨해튼 1
        int[] dr1 = {-1, 1, 0, 0};
        int[] dc1 = {0, 0, -1, 1};
        
        // 맨해튼 2 (직선)
        int[] dr2 = {-2, 2, 0, 0};
        int[] dc2 = {0, 0, -2, 2};
        
        // 맨해튼 2 (대각선)
        int[] dr3 = {-1, -1, 1, 1};
        int[] dc3 = {-1, 1, -1, 1};
        
        for (int r = 0; r < 5; r++) {
            for (int c = 0; c < 5; c++) {
                char p1 = place[r].charAt(c);
                
                if (p1 == 'P') {
                    // 1. 맨해튼 1
                    for (int d = 0; d < 4; d++) {
                        int nr = r + dr1[d];
                        int nc = c + dc1[d];
                        
                        if (nr < 0 || nc < 0 || nr > 4 || nc > 4) continue;
                        
                        char p2 = place[nr].charAt(nc);
                        
                        if (p2 == 'P') return false;
                    }
                    
                    // 2. 맨해튼 2 (직선)
                    for (int d = 0; d < 4; d++) {
                        int nr = r + dr2[d];
                        int nc = c + dc2[d];
                        
                        if (nr < 0 || nc < 0 || nr > 4 || nc > 4) continue;
                        
                        char p2 = place[nr].charAt(nc);
                        char mid = place[r + dr1[d]].charAt(c + dc1[d]);
                        
                        if (p2 == 'P' && mid == 'O') return false;
                    }
                    
                    // 3. 맨해튼 2 (대각선)
                    for (int d = 0; d < 4; d++) {
                        int nr = r + dr3[d];
                        int nc = c + dc3[d];
                        
                        if (nr < 0 || nc < 0 || nr > 4 || nc > 4) continue;
                        
                        char p2 = place[nr].charAt(nc);
                        char mid1 = place[nr].charAt(c);
                        char mid2 = place[r].charAt(nc);
                        
                        if (p2 == 'P' && (mid1 == 'O' || mid2 == 'O')) return false;
                    }
                }
            }
        }
        
        return true;
    }
}