const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim();

const N = Number(input);
console.log(Math.pow(2, N));