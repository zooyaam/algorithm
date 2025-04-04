const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const [A, B] = input.map(BigInt);

console.log(`${A + B}\n${A - B}\n${A * B}`);