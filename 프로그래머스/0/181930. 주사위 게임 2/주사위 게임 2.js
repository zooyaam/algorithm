function solution(a, b, c) {
    const arr = Array.from(new Set([a, b, c]));
    
    if (arr.length === 1) {
        return 27 * Math.pow(a, 6)
    } else if (arr.length === 2) {
        return (a + b + c) * (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
    } else {
        return a + b + c;
    }
}
