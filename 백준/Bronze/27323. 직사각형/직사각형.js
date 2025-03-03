const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim();

const [A, B] = input.split('\n').map(Number);

console.log(A * B);