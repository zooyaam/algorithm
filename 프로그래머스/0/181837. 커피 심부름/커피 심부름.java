class Solution {
    public int solution(String[] order) {
        int americano = 0;
        int latte = 0;
        
        for (String o : order) {
            if (o.contains("latte")) {
                latte++;
            } else {
                americano++;
            }
        }
        
        return americano * 4500 + latte * 5000;
    }
}