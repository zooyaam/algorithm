function solution(n) {
    let count = 0;
    
    if(n <= 3) return 0;

    for(let i = 4; i <= n; i++) {
        for(let j = 2; j <= Math.sqrt(i); j++){
            if(i % j === 0) {
                count++;
                break;
            }
        }
    }
    return count;
}