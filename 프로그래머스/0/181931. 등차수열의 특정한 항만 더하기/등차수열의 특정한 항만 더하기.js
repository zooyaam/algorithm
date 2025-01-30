function solution(a, d, included) {
    let result = 0;
    
    for(let i = 0; i < included.length; i++) {
        included[i] ? result += a + d * i : result;
    }
    return result;
}