import java.util.*;
import java.io.FileInputStream;

class Solution
{
    static int priority(char c) {
    	if (c == '*' ) return 2;
        if (c == '+') return 1;
        return 0;
    }
    
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);

		for(int test_case = 1; test_case <= 10; test_case++)
		{
			int l = sc.nextInt();
            String line = sc.next();
            
            Stack<Character> oper = new Stack<>();  // 연산자 스택
            StringBuilder sb = new StringBuilder();  // 후위표기식
            
            // 후위표기식 생성
			for (int i = 0; i < l; i++) {
            	char c = line.charAt(i);
                
                if (priority(c) > 0) {
                    // 연산자
                	while (!oper.isEmpty() && priority(oper.peek()) >= priority(c)) {
                    	sb.append(oper.pop());
                    }
                    oper.push(c);
                } 
                else sb.append(c);
            }
            
            while (!oper.isEmpty()) sb.append(oper.pop());
            
            // 계산
            Stack<Integer> num = new Stack<>();
            
            for (int i = 0; i < l; i++) {
                char c = sb.charAt(i);
                int p = priority(c);
                
                if (p == 0) num.push(c - '0');
                else {
                    int n1 = num.pop();
                    int n2 = num.pop();
                    
                    if (p == 2) num.push(n1*n2);
                    else num.push(n1+n2);
                }
            } 
            
            System.out.println("#" + test_case + " " + num.pop());
		}
	}
}