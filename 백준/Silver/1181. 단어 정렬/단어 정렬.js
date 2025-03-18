const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim();

const arr = input.split('\n').slice(1);
const uniqueArr = [...new Set(arr)];
uniqueArr.sort((a, b) => a.length - b.length || a.localeCompare(b));

console.log(uniqueArr.join('\n'));