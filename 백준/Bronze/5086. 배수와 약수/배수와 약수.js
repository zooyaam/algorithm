const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim();

const line = input.split('\n');

for(let i = 0; i < line.length - 1; i++) {
    const [A, B] = line[i].split(' ');
    solution(Number(A), Number(B));
}

function solution(a, b) {
    if(b % a === 0) {
        console.log('factor');
    } else if(a % b === 0) {
        console.log('multiple');
    } else {
        console.log('neither');
    }
}