const fs = require('fs');
let input = fs.readFileSync("/dev/stdin").toString().trim();

let string = input;

function solution(string) {
    console.log(string.charCodeAt());
}

solution(string);