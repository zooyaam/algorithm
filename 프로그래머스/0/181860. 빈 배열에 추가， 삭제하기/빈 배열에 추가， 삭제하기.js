function solution(arr, flag) {
    return flag.reduce((acc, cur, idx) => {
        if(cur) {
            acc.push(...Array(arr[idx] * 2).fill(arr[idx]));        
        } else {
            acc.splice(-arr[idx]);
        }
        return acc;
    }, [])
}