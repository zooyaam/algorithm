const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim();

const lines = input.split('\n').map(line => line.split(' ').map(Number));
const x = lines.map(dot => dot[0]);
const y = lines.map(dot => dot[1]);

function solution(arr) {
    return arr.find(num => arr.indexOf(num) === arr.lastIndexOf(num));
}

console.log(solution(x), solution(y));