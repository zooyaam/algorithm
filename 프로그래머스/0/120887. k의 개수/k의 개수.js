function solution(i, j, k) {
    let result = 0;
    
    for (let num = i; num <= j; num++) {
        result += (num.toString().split(k.toString()).length - 1);
    }
    
    return result;
}
