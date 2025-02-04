function solution(arr, k) {
    arr = [...new Set(arr)];
    
    if(arr.length < k) {
        let l = arr.length;
        arr.length = k;
        return arr.fill(-1, l, k);
    } else {
        return arr.slice(0, k);
    }
}