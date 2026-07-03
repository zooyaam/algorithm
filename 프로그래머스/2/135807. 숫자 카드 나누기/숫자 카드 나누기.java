import java.util.*;

class Solution {
    public int solution(int[] arrayA, int[] arrayB) {
        int a = findDivisor(arrayA, arrayB);
        int b = findDivisor(arrayB, arrayA);
        
        return Math.max(a, b);
    }
    
    public int findDivisor(int[] arr, int[] arr2) {
        int gcd = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            gcd = getGcd(gcd, arr[i]);
        }
        
        List<Integer> divisors = new ArrayList<>();
        
        for (int n = 1; n * n <= gcd; n++) {
            if (gcd % n != 0) continue;
            
            divisors.add(n);
            if (n != gcd / n) divisors.add(gcd / n);
        }
        
        Collections.sort(divisors, Collections.reverseOrder());
        
        for (int d : divisors) {
            if (!isDivisible(arr2, d)) return d;
        }
        
        return 0;
    }
    
    public int getGcd(int a, int b) {
        while (b != 0) {
            int r = b;
            b = a % b;
            a = r;
        }
        
        return a;
    }
    
    public boolean isDivisible(int[] arr, int q) {
        for (int num : arr) {
            if (num % q == 0) return true;
        }
        return false;
    }
}