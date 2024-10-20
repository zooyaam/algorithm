function solution(t, p) {
    const l = p.length
    const arr = [];
    for(let i=0; i <= t.length-l; i++){
        arr.push(t.substring(i, i+l))
    }
    return arr.filter(item => item <= p).length
}