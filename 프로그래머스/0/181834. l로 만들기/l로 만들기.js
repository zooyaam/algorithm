function solution(myString) {
    return myString
            .split('')
            .map((s) => s < 'l' ? s = 'l' : s)
            .join('');
}