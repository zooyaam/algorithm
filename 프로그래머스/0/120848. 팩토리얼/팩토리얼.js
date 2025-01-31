function solution(n, i = 1, factorial = 1) {
    if (factorial * (i + 1) > n) return i;
    return solution(n, i + 1, factorial * (i + 1));
}
