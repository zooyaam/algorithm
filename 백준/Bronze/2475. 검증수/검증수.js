const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim();

const arr = input.split(' ').map((num) => Math.pow(Number(num), 2));
const sum = arr.reduce((acc, cur) => acc + cur, 0);

console.log(sum % 10);
