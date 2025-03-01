const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim();

const [N, K] = input.split(' ');

function solution() {
    let divisors = [];
    for(let i = 1; i * i <= N; i++) {
        if(N % i === 0) {
            divisors.push(i);
            if(i !== N / i) {
                divisors.push(N / i);
            }
        }
    }
    
    if(divisors.length < K) return console.log(0);
    
    divisors.sort((a, b) => a - b);
    console.log(divisors[K - 1]);
}

solution();