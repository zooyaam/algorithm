const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n').map(Number);

function isPrime(num) {
    if (num < 2) return false;
    if (num === 2 || num === 3) return true;
    if (num % 2 === 0 || num % 3 === 0) return false;
    
    for (let i = 5; i * i <= num; i += 2) {
        if (num % i === 0) return false;
    }
    return true;
}

for (let i = 0; i < input.length; i++) {
    let count = 0;
    let N = input[i];

    if (N === 0) break;
    
    for (let j = N + 1; j <= 2 * N; j++) {
        if (isPrime(j)) count++;
    }
    
    console.log(count);
}
