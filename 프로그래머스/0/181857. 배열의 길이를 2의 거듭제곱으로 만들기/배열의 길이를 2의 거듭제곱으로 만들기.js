function solution(arr) {
    const length = arr.length;
    
    const nextPowerOfTwo = Math.pow(2, Math.ceil(Math.log2(length)));
    const zerosToAdd = nextPowerOfTwo - length;
    
    return [...arr, ...Array(zerosToAdd).fill(0)];
}
