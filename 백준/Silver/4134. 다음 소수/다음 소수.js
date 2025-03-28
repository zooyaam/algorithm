const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n').map(Number);

const N = input[0];

function isPrime(n) {
    if (n < 2) return false;
    if (n === 2 || n === 3) return true;
    if (n % 2 === 0 || n % 3 === 0) return false;
    
    for (let i = 5; i * i <= n; i += 2) {
        if (n % i === 0) return false;
    }
    return true;
}

function nextPrime(m) {
    if (m <= 2) return 2;
    if (m % 2 === 0) m++;
    
    while(!isPrime(m)) {
        m += 2;
    }
    return m;
}

for (let i = 1; i <= N; i++) {
    console.log(nextPrime(input[i]));
}

