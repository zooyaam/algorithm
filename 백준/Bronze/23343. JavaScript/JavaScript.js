const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim();

const [x, y] = input.split(' ');
console.log(x - y ? x - y : 'NaN');