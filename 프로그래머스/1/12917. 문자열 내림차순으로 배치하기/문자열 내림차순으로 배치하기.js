function solution(s) {
    let arr = Array.from(s);
    arr = arr.map((item) => (item.charCodeAt()));
    arr.sort((a, b) => b - a)
    return arr.map((item) => (String.fromCharCode(item))).join('')
}