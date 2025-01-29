function solution(n) {
    const result = [];
    
    for(let i = 0; i < n; i++){
        result.push(new Array(n).fill(0));
        result[i][i] = 1;
    }
    return result;
}