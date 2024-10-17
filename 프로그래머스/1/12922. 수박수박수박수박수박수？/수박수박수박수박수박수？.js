function solution(n) {
    let k = n / 2
    let j = n % 2
    
    if(j === 1) {
        return "수박".repeat(k) + "수"
    } else {
        return "수박".repeat(k)
    }
}