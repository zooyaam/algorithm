const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim();

function solution(N) {
    let dot = 2;
    for(let i = 1; i <= N; i++) {
        dot = 2 * dot - 1;
    }
    
    console.log(dot * dot);
}

solution(input);