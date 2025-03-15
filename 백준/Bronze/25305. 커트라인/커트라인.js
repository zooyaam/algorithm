const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim();

const line = input.split('\n').map((line) => line.split(' ').map(Number));
const k = line[0][1];

function solution() {
    let arr = line[1].sort((a, b) => b - a);
    console.log(arr[k - 1]);
}

solution();