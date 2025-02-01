function solution(array) {
    return array.join('').split('').reduce((acc, cur) => {
        if(cur === '7') {
            acc += 1;
        }
        return acc;
    }, 0)
}