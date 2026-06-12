import java.util.*;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		for(int test_case = 1; test_case <= 10; test_case++)
		{
            int tnum = sc.nextInt();
            
            Queue<Integer> que = new LinkedList<>();
            for (int i = 0; i < 8; i++) que.offer(sc.nextInt());
            
            int mod = 0;
            while (true) {
                int num = que.poll();
            	int next = num - mod - 1;
                
                if (next <= 0) {
                	que.offer(0);
                    break;
                }
	
                que.offer(next);
                mod = (mod + 1) % 5;
            }
            
            StringBuilder sb = new StringBuilder();
            sb.append("#" + tnum);
            for (int i = 0; i < 8; i++) sb.append(" " + que.poll());
            
            System.out.println(sb.toString());
		}
	}
}