function solution(myStr) {
    const result = myStr.replaceAll('a', ' ')
        .replaceAll('b', ' ')
        .replaceAll('c', ' ')
        .split(' ')
        .filter(str => str !== '');

    return result.length > 0 ? result : ["EMPTY"];
}
