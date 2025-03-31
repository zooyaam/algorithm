const fs = require('fs');
const input = fs.readFileSync('/dev/stdin');

const N = Number(input);

console.log(Math.floor(Math.sqrt(N)));