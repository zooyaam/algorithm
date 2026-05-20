import java.util.*;

class Solution {
    class File {
        String full;
        String head;
        int num;
        int idx;
        
        File (String f, String h, String n, int i) {
            full = f;
            head = h;
            num = Integer.parseInt(n);
            idx = i;
        }
    }
    
    public String[] solution(String[] files) {
        List<File> list = new ArrayList<>();
        
        // 파싱
        for (int i = 0; i < files.length; i++) {
            StringBuilder h = new StringBuilder();
            StringBuilder n = new StringBuilder();
            
            boolean isNum = false;
            for (char c : files[i].toCharArray()) {
                if (!isNum) {
                    // HEAD
                    if (Character.isDigit(c)) {
                        isNum = true;
                        n.append(c);
                    } else {
                        h.append(c);
                    }
                } else {
                    // NUMBER
                    if (Character.isDigit(c)) n.append(c);
                    else break;
                }
            }
            
            list.add(new File(files[i], h.toString().toLowerCase(), n.toString(), i));
        }
        
        // 정렬
        list.sort((a, b) -> {
            // HEAD 오름차순
            if (a.head.compareTo(b.head) != 0) return a.head.compareTo(b.head);
            
            // NUMBER 오름차순
            if (a.num != b.num) return a.num - b.num;
            
            // index 오름차순
            return a.idx - b.idx;
        });
        
        // 출력
        String[] result = new String[files.length];
        
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i).full;
        }
        
        return result;
    }
}