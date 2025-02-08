function solution(dots) {
    const x = dots.map((arr) => arr[0]);
    const y = dots.map((arr) => arr[1]);
    
    const width = Math.max(...x) - Math.min(...x);
    const length = Math.max(...y) - Math.min(...y);
    
    return width * length;
}