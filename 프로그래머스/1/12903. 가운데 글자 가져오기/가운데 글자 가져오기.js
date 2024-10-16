function solution(s) {
    let arr_s = s.split('')
    let n = arr_s.length / 2
    
    if(arr_s.length % 2){
        return arr_s[Math.floor(n)]
    } else {
        return arr_s.slice(n - 1, n + 1).join("")
    }
}