const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n').map(Number);

const K = input[0];
const stack = [];

for (let i = 1; i <= K; i++) {
    if(input[i] === 0) {
        stack.pop();
    } else {
        stack.push(input[i]);
    }
}

console.log(stack.reduce((acc, cur) => acc + cur, 0));