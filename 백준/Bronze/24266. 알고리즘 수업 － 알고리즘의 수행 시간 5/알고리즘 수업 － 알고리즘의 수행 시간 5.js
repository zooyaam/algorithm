const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim();

const n = BigInt(input);
console.log((n * n * n).toString());
console.log(3);
