function solution(my_string) {
    return my_string.split('').reduce((acc, cur) => {
        return acc.includes(cur) ? acc : acc += cur;
    }, '')
}
