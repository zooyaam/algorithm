import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        PriorityQueue<Integer> minQ = new PriorityQueue<>();
        PriorityQueue<Integer> maxQ = new PriorityQueue<>(Collections.reverseOrder());
        
        for (String oper : operations) {
            switch (oper) {
                case "D 1" : {
                    if (!maxQ.isEmpty()) {
                        int num = maxQ.poll();
                        minQ.remove(num);
                    }
                    break;
                }
                case "D -1" : {
                    if (!minQ.isEmpty()) {
                        int num = minQ.poll();
                        maxQ.remove(num);
                    }
                    break;
                }
                default : {
                    int num = Integer.parseInt(oper.split(" ")[1]);
                    minQ.offer(num);
                    maxQ.offer(num);
                    break;
                }
            }
        }
        
        if (minQ.isEmpty()) return new int[]{0, 0};
        
        return new int[]{maxQ.poll(), minQ.poll()};
    }
}