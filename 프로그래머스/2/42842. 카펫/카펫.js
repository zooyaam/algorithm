function solution(brown, yellow) {
    const size = brown + yellow;
    
    for (let h = 1; h * h <= size; h++) {
        const w = size / h;
        
        if((w - 2) * (h - 2) === yellow) return [w, h];
    }
}