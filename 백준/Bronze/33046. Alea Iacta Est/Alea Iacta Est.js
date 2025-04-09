const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const sum = input.flatMap(line => line.split(' ')).reduce((a, b) => a + Number(b), 0);
const result = (sum - 1) % 4;

console.log(result > 0 ? result : 4);