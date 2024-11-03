const fs = require("fs");
let input = fs.readFileSync("/dev/stdin").toString().trim();

function solution(word) {
    for (let i = 0; i < Math.floor(word.length / 2); i++) {
        if (word[i] !== word[word.length - i - 1]) {
            return 0;
        }
    }
    return 1;
}

console.log(solution(input));
