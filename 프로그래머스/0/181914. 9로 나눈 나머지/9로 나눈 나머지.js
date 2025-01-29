function solution(number) {
    const sum = number.split('')
                    .map((n) => Number(n))
                    .reduce((arr, cur) => arr + cur, 0);
    return sum % 9;

}