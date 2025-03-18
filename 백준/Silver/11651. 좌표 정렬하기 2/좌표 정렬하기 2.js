const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim();

let dots = input.split('\n').slice(1).map((dot) => dot.split(' ').map(Number));
dots.sort((a, b) => a[1] - b[1] || a[0] - b[0]);

console.log(dots.map((dot) => dot.join(' ')).join('\n'));