class Solution {
    public int solution(String[] strArr) {
        // Map과 Array의 공간복잡도는 O(1)로 동일.
        // 그러나, Map의 내부 계산이 훨씬 무겁기 때문에 Array로 구현한다.
        
        int arr[] = new int[31];
        
        for (String s : strArr) {
            int idx = s.length();
            arr[idx]++;
        }
        
        int max = 0;
        for (int i : arr) {
            if (i > max) max = i;
        }
        
        return max;
    }
}