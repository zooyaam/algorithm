function solution(myString) {
    return myString
        .toLowerCase()
        .split('')
        .map((str) => str === 'a' ? str.toUpperCase() : str)
        .join('');
}