const fs = require('fs');
const input = fs.readFileSync('/dev/stdin');

const a = Number(BigInt(input));
const r = Math.sqrt(a / Math.PI);

console.log(2 * Math.PI * r);