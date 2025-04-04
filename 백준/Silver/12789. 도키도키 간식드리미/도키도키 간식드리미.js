const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const N = Number(input[0]);
const arr = input[1].split(' ').map(Number);

const stack = [];
let count = 1;

for (let i = 0; i < N; i++) {
    const num = arr[i];
    
    if (num === count) {
        count++;
    } else {
        stack.push(num);
    }
    
    while (stack.length > 0 && stack[stack.length - 1] === count) {
        stack.pop();
        count++;
    }
}

console.log(stack.length === 0 ? "Nice" : "Sad");