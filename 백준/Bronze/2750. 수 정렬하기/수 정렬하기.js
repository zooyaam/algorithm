const fs = require('fs')
const input = fs.readFileSync('/dev/stdin').toString().trim();

const line = input.split('\n').map(Number);
const N = line[0];

function solution() {
    let arr = line.slice(1);
    arr.sort((a, b) => a - b);  
    arr.forEach((num) => console.log(num));
}

solution();