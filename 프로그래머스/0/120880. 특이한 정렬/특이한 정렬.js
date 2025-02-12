function solution(numlist, n) {
    return numlist
        .map(num => [Math.abs(num - n), num])
        .sort((a, b) => a[0] - b[0] || b[1] - a[1])
        .map(n => n[1]);
}