const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim();

const [N, K] = input.split(' ').map(Number);
const arr = Array.from({ length: N }, (_, i) => i + 1);

const res = [];
let idx = 0;

while (arr.length > 0) {
    idx = (idx + K - 1) % arr.length;
    res.push(arr.splice(idx, 1)[0]);
}

console.log(`<${res.join(', ')}>`)