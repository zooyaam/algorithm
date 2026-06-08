import java.util.*;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		
        for(int test_case = 1; test_case <= 10; test_case++)
		{
			int limit = sc.nextInt();
            
            PriorityQueue<Integer> minHeap = new PriorityQueue<>();
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
            
            for (int i = 0; i < 100; i++) {
            	int n = sc.nextInt();
                minHeap.offer(n);
                maxHeap.offer(n);
            }
            
            for (int i = 0; i < limit; i++) {
            	int max = maxHeap.poll();
                maxHeap.offer(max - 1);
                
                int min = minHeap.poll();
                minHeap.offer(min+1);
            }
            
            int result = maxHeap.poll() - minHeap.poll();
            
            System.out.println("#" + test_case + " " + result);
		}
	}
}