const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim();

const n = parseInt(input);
const result = BigInt(n) * BigInt(n - 1) * BigInt(n - 2) / BigInt(6);
console.log(`${result}`);
console.log(3);
