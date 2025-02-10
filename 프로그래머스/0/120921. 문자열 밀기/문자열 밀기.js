function solution(A, B) {
    if(A === B) return 0;
    
    let a = A.split('');
    let count = 0;
    
    for(let i=0; i<A.length; i++) {
        let last = a.pop();
        a.unshift(last);
        count++;
        
        if(a.join('') === B) return count;
    }
    return -1;
}