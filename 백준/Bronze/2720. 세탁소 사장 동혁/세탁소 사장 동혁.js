const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim();

const lines = input.split('\n');
const T = Number(lines[0]);

function solution(C) {
    let Q = Math.floor(C / 25);
    C %= 25;
    
    let D = Math.floor(C / 10);
    C %= 10;
    
    let N = Math.floor(C / 5);
    let P = C % 5;
    
    console.log(Q, D, N, P);
}

for (let i = 1; i <= T; i++) {
    solution(Number(lines[i]));
}

