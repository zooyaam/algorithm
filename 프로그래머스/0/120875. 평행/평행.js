function solution(dots) {
    const isParallel = ([x1, y1], [x2, y2], [x3, y3], [x4, y4]) => {
        return (y2 - y1) * (x4 - x3) === (y4 - y3) * (x2 - x1);
    }
    
    const [a, b, c, d] = dots;
    
    if (isParallel(a, b, c, d)) return 1;
    if (isParallel(a, c, b, d)) return 1;
    if (isParallel(a, d, b, c)) return 1;
    return 0;
}