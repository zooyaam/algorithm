function solution(arr) {
    let stk = [];
    
    for (let i = 0; i < arr.length; i++) {
        if (stk.length === 0 || stk[stk.length - 1] !== arr[i]) {
            stk.push(arr[i]);
        } else {
            stk.pop();
        }
    }
    
    return stk.length > 0 ? stk : [-1];
}
