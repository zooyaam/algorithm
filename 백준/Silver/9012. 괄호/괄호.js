const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const T = Number(input[0]);

function VPS(arr) {
    let stack = [];
    for (let i = 0; i < arr.length; i++) {
        if (arr[i] === '(') {
            stack.push(arr[i]);
        } else {
            if (stack.length > 0) {
                stack.pop();
            } else {
                return 'NO';
            }
        }
    }
    return stack.length === 0 ? 'YES' : 'NO';
}

for (let i = 1; i <= T; i++) {
    const arr = input[i].split('');
    console.log(VPS(arr));
}