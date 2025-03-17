const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim();

const str = input.split('');
console.log(str.sort((a, b) => b - a).join(''));