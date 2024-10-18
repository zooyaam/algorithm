function solution(s) {
    let arr_s = Array.from(s);
    if(s.length === 4 || s.length === 6) {
        arr_s = arr_s.map((item) => (isNaN(item) ? 'f' : 't'))
        return arr_s.every((item) => item === 't')
    } else return false
}