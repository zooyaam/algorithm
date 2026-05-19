import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        Map<String, String> user = new HashMap<>();
        
        int cnt = 0;
        
        for (String r : record) {
            String[] arr = r.split(" ");
            
            String type = arr[0];
            String id = arr[1];
            
            if (!type.equals("Change")) cnt++;
            
            if (!type.equals("Leave")) {
                String nick = arr[2];
                user.put(id, nick);
            }
        }
        
        String[] result = new String[cnt];

        int idx = 0;
        for (String r : record) {
            String[] arr = r.split(" ");
            
            String type = arr[0];
            String id = arr[1];
            String nick = user.get(id);
            
            if (type.equals("Enter")) {
                result[idx++] = nick + "님이 들어왔습니다.";
            } else if (type.equals("Leave")) {
                result[idx++] = nick + "님이 나갔습니다.";
            }
        }
        
        return result;
    }
}