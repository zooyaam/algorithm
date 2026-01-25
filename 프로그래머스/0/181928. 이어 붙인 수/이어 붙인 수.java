class Solution {
    public int solution(int[] num_list) {
        String odd = "";
        String even = "";
        
        for (int num : num_list) {
            if (num % 2 == 0) {
                even += num;
            } else {
                odd += num;
            }
        }
        
        int evenNum = Integer.parseInt(even);
        int oddNum = Integer.parseInt(odd);

        return evenNum + oddNum;
    }
}