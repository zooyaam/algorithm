const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim();

const [n, k] = input.split(' ').map(Number);
let res = 1;

for (let i = 1; i <= k - 1; i++) {
  res *= (n - 1) - (k - 1 - i);
  res /= i;
}

console.log(res);
