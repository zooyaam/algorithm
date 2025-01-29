function solution(n) {
    const result = [n];  // 시작값 n을 먼저 저장
    
    while (n !== 1) {
        if (n % 2) {
            n = 3 * n + 1;
        } else {
            n = n / 2;
        }
        result.push(n);
    }
    
    return result;
}
