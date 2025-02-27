const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim();

const [A, B, V] = input.split(' ').map(Number);

function solution() {
    let days = Math.ceil((V - A) / (A - B)) + 1;
    console.log(days);
}

solution();