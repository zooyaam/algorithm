function solution(arr) {
    let stk = [];
    let i = 0;

    while (i < arr.length) {
        if (!stk.length || stk[stk.length - 1] < arr[i]) {
            stk.push(arr[i]);
            i++;
        } else {
            stk.pop();
        }
    }
    
    return stk;
}
