const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim();

let members = input.split('\n').slice(1).map((mem) => mem.split(' '));
members.sort((a, b) => Number(a[0]) - Number(b[0]));

console.log(members.map((mem) => mem.join(' ')).join('\n'));