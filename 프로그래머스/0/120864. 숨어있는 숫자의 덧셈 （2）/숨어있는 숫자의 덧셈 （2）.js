function solution(my_string) {
    const numbers = my_string.match(/\d+/g) || [];
    return numbers.reduce((acc, cur) => acc + Number(cur), 0)
}