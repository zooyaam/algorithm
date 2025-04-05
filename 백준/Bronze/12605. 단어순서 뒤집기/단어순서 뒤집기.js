const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const N = Number(input[0]);

for (let i = 1; i <= N; i++) {
    let str = input[i].split(' ').reverse().join(' ');
    console.log(`Case #${i}: ${str}`)
}