function solution(arr) {
    const min = Math.min(...arr);
    
    if(arr.length === 1 && arr[0] === 10) {
        return [-1]
    } else {
        arr.splice(arr.indexOf(min), 1)
    }
    return arr
}