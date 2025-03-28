const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim();
const [M, N] = input.split(' ').map(Number);

function isPrime(num) {
    if (num < 2) return false;
    if (num === 2 || num === 3) return true;
    if (num % 2 === 0 || num % 3 === 0) return false;
    
    for (let i = 5; i * i <= num; i += 2) {
        if(num % i === 0) return false;
    }
    return true;
}

for(let i = M; i <= N; i++) {
    isPrime(i) && console.log(i);
}