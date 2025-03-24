const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const A = new Set(input[1].split(' ').map(Number));
const B = new Set(input[2].split(' ').map(Number));

const diffA = [...A].filter(num => !B.has(num));
const diffB = [...B].filter(num => !A.has(num));

console.log(diffA.length + diffB.length);