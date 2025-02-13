function solution(code) {
    let ret = [];
    let mode = 0
    
    for(let i=0; i<code.length; i++) {
        if(code[i] == 1) {
            mode = 1 - mode;
        } else {
            if((mode === 0 && i%2 === 0) || (mode === 1 && i%2 === 1)) {
                ret.push(code[i])
            }
        }
    }
    
    return ret.length ? ret.join('') : 'EMPTY';
}