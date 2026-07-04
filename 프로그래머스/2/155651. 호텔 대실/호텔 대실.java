import java.util.*;

class Solution {
    public class Book {
        int start;
        int end;
        
        Book(String s, String e) {
            start = parseTime(s);
            end = parseTime(e);
        }
        
        private int parseTime(String time) {
            String[] t = time.split(":");
            
            int h = Integer.parseInt(t[0]);
            int m = Integer.parseInt(t[1]);
            
            return h * 60 + m;
        }
    }
    
    public int solution(String[][] book_time) {        
        Book[] books = new Book[book_time.length];
        
        for (int i = 0; i < books.length; i++) {
            books[i] = new Book(book_time[i][0], book_time[i][1]);
        }
        
        Arrays.sort(books, (a, b) -> a.start - b.start);
        
        PriorityQueue<Integer> minH = new PriorityQueue();
        minH.add(0);
        
        for (Book b : books) {
            if (minH.peek() <= b.start) minH.poll();
            minH.add(b.end + 10);
        }
        
        return minH.size();
    }
}