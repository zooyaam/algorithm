const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim();

let N = Number(input);
let primes = [];

function isPrime(n) {
    if(n === 2) return true;
    if(n % 2 === 0) return false;
    
    for(let i = 3; i <= Math.sqrt(n); i += 2) {
        if(n % i === 0) return false;
    }
    return true;
}

function solution() {
    for(let i = 2; i <= N; i++) {
        if(isPrime(i)) primes.push(i);
    }
    primes.sort((a, b) => a - b);
    
    for(let j = 0; j < primes.length; j++) {
        const prime = primes[j];
        
        while(N % prime === 0) {
            console.log(prime);
            N /= prime;
        }
        if(N === 1) break;
    }
    if(N > 1) console.log(N);
}

solution();