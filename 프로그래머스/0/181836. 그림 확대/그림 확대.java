class Solution {
    public String[] solution(String[] picture, int k) {
        String[] result = new String[picture.length * k];
        
        int idx = 0;
        
        for (String row : picture) {
            StringBuilder sb = new StringBuilder();

            for (char c : row.toCharArray()) {
                for (int i = 0; i < k; i++) {
                    sb.append(c);
                }
            }

            String expanded = sb.toString();

            for (int i = 0; i < k; i++) {
                result[idx++] = expanded;
            }
        }

        return result;
    }
}