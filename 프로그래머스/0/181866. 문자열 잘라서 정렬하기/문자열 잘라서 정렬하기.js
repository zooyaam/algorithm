function solution(myString) {
    return myString
            .replaceAll('x', ' ')
            .split(' ')
            .sort()
            .filter(str => str !== '');
}