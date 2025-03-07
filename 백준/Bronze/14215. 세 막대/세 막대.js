const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim();

const sides = input.split(' ').map(Number);
let [a, b, c] = sides.sort((a, b) => b - a);

function solution() {
    while(a >= b + c) {
        a -= 1;
    }
    console.log(a + b + c);
}

solution();