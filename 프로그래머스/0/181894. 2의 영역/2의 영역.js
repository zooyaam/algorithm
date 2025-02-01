function solution(arr) {
    const s = arr.indexOf(2);
    const e = arr.lastIndexOf(2);
    
    if(s === -1) return [-1];
    if(s === e) return [2];
    return arr.slice(s, e+1);
    
    
}