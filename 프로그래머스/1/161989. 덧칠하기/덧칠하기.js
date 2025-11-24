function solution(n, m, section) {
    let cnt = 0;
    let curr = 0;
    
    while (curr < section.length) {
        cnt++;
        
        const s = section[curr];
        const e = s + m - 1;
        
        while (curr < section.length && section[curr] <= e) {
            curr++;
        }
    }
    
    return cnt;
}