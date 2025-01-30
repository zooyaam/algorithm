function solution(myString) {
    const result = myString.replaceAll('x', ' ').split(' ');
    return result.map((item) => item = item.length);
}