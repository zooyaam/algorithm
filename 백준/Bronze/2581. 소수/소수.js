const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim();

const [M, N] = input.split('\n').map(Number);

function solution() {
    let primes = [];
    
    for (let i = M; i <= N; i++) {
        if (isPrime(i)) primes.push(i);
    }
    
    if (primes.length < 1) {
        console.log('-1');
    } else {
        console.log(primes.reduce((acc, cur) => acc + cur, 0));
        console.log(Math.min(...primes));
    }
}

function isPrime(n) {
    if (n === 1) return false;
    if (n === 2) return true;
    if (n % 2 === 0) return false;
    
    for (let i = 3; i <= Math.sqrt(n); i += 2) {
        if (n % i === 0) return false;
    }
    return true;
}

solution();
