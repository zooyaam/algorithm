const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim();

const arr = input.split('\n').map(Number).sort((a, b) => a - b);

function solution() {
    console.log(arr.reduce((acc, cur) => acc + cur) / arr.length);
    console.log(arr[2]);
}

solution();