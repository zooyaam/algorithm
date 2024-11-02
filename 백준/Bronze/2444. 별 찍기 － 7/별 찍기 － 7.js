const fs = require("fs");
let input = fs.readFileSync("/dev/stdin").toString().trim();

const N = Number(input);

function solution(N) {
    for (let i = 1; i <= N; i++) {
        const stars = '*'.repeat(2 * i - 1);
        const spaces = ' '.repeat(N - i);
        
        console.log(spaces + stars);
    }
    
    for (let i = N - 1; i >= 1; i--) {
        const stars = '*'.repeat(2 * i - 1);
        const spaces = ' '.repeat(N - i);
        
        console.log(spaces + stars);
    }
}

solution(N);
