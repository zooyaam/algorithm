function solution(n) {
    let factors = new Set();
    
    while (n % 2 === 0) {
        factors.add(2)
        n /= 2;
    }
    
    for(let i = 3; i*i <= n; i += 2) {
        while (n % i === 0) {
            factors.add(i);
            n /= i;
        }
    }
    
    if (n > 1) {
        factors.add(n);
    }
    
    return [...factors].sort((a, b) => a - b);
}