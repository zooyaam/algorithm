function solution(num, total) {
    const n = (total / num) - ((num-1) / 2);
    const result = Array.from({ length: num }, (_, i) => n + i);
    
    return result;
}