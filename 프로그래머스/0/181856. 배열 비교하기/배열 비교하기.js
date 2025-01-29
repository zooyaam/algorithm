function solution(arr1, arr2) {
    if (arr1.length !== arr2.length) 
        return arr1.length > arr2.length ? 1 : -1;

    const [sum1, sum2] = [arr1, arr2].map((arr) => 
        arr.reduce((acc, cur) => acc + cur, 0)
    );

    return Math.sign(sum1 - sum2);
}
