import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        String input = br.readLine();
        
        Stack<Character> stack = new Stack<>();
        
        int cnt = 0;
        char prev = ' ';
        
        for (char c : input.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else {
                stack.pop();
                
                if (prev == '(') {
                    cnt += stack.size();
                } else {
                    cnt += 1;
                }
            }
            
            prev = c;
        }
        
        System.out.print(cnt);
    }
}