function solution(s) {
    let stack = [];
    stack.push(s[0])
    
    for (let i = 1; i < s.length; i++) {
        let curr = s[i];
        
        if (stack[stack.length - 1] === curr) {
            stack.pop();
        } else {
            stack.push(curr);
        }
    }
    
    return stack.length ? 0 : 1;
}