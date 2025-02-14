function solution(l, r) {
    let queue = [5];
    let result = [];
    
    while (queue.length > 0) {
        let num = queue.shift();
        
        if (num >= l && num <= r) {
            result.push(num);
        }
        
        let next1 = num * 10;
        let next2 = num * 10 + 5;
        
        if (next1 <= r) queue.push(next1);
        if (next2 <= r) queue.push(next2);
    }
    
    return result.length > 0 ? result : [-1];
}
