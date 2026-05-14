class Solution {
    public int solution(int n, int k) {
        String knum = Integer.toString(n, k);
        String[] arr = knum.split("0");
        
        int result = 0;
        
        for (String a : arr) {
            if (a.equals("")) continue;
            
            long num = Long.parseLong(a);
            
            if (num == 1) continue;
            if (isPrime(num)) result++;
        }
        
        return result;
    }
    
    public boolean isPrime(long n) {
        for (long i = 2; i*i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}