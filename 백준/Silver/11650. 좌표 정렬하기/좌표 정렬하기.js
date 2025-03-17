const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim();

const line = input.split('\n').slice(1).map((dot) => dot.split(' ').map(Number));
line.sort((a, b) => a[0] - b[0] || a[1] - b[1]);

console.log(line.map((dot) => dot.join(' ')).join('\n'));