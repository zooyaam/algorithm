function solution(numbers, k) {
    let index = 0;

    for (let i = 1; i < k; i++) {
        index = (index + 2) % numbers.length;
    }
    return numbers[index];
}
