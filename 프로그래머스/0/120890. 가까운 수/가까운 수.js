function solution(array, n) {
    const sortedArray = array
        .map(num => [num, Math.abs(num - n)])
        .sort((a, b) => a[1] === b[1] ? a[0] - b[0] : a[1] - b[1]);
    return sortedArray[0][0];
}
