function solution(a, b, n) {
    let count = 0;  // 받은 콜라 병의 개수
    
    while (n >= a) {
        let i = n - (n % a);  // 반납할 빈 병의 개수
        let j = b * (i / a);  // 돌려받을 병의 개수
        
        n = n - i + j;
        count += j;
    }
    
    return count;
}