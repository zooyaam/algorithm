class Solution {
    public int solution(String binomial) {
        String[] bin = binomial.split(" ");
        
        int a = Integer.valueOf(bin[0]);
        int b = Integer.valueOf(bin[2]);
        String op = bin[1];
        
        switch (op) {
            case "+" : return a + b;
            case "-" : return a - b;
            case "*" : return a * b;
                
            default : throw new IllegalArgumentException("잘못된 연산자");
        }
    }
}