function solution(k, score) {
    let result = [];
    let top = [];
    
    for (let i = 0; i < score.length; i++) {
        top.push(score[i]);
        top.sort((a, b) => b - a);
        
        if (top.length > k) {
            top.pop();
        }
        
        result.push(top.length < k ? Math.min(...top) : top[top.length - 1]);
    }
    
    return result;
}
