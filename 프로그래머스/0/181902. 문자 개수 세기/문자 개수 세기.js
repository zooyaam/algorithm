function solution(my_string) {
    let arr = new Array(52).fill(0);

    for (let char of my_string) {
        let code = char.charCodeAt(0);
        if (code >= 65 && code <= 90) {
            arr[code - 65] += 1;
        } else if (code >= 97 && code <= 122) {
            arr[code - 71] += 1;
        }
    }

    return arr;
}
