const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim();

const line = input.split('\n').map(Number);
const arr = line.slice(1).sort((a, b) => a - b);

console.log(arr.join('\n'));

