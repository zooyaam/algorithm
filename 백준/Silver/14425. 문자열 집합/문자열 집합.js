const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim();

const line = input.split('\n');
const [N, M] = line[0].split(' ').map(Number);
const S = new Set(line.slice(1, N + 1));
const checkList = line.slice(N + 1); 

let count = checkList.reduce((acc, word) => acc + (S.has(word) ? 1 : 0), 0);

console.log(count);
