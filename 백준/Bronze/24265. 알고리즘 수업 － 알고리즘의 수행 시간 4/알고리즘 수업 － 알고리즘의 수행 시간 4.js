const fs = require('fs');
const input = fs.readFileSync('/dev/stdin');

const n = Number(input);

console.log((n * (n - 1)) / 2);
console.log(2);