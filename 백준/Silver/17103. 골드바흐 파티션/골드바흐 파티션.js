const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const MAX = 1000000;
const isPrime = new Array(MAX + 1).fill(true);
isPrime[0] = isPrime[1] = false;

for (let i = 2; i * i <= MAX; i++) {
    if (isPrime[i]) {
        for (let j = i * i; j <= MAX; j += i) {
            isPrime[j] = false;
        }
    }
}

const T = Number(input[0]);

for (let t = 1; t <= T; t++) {
    const N = Number(input[t]);
    let count= 0;
    
    for (let i = 2; i <= N / 2; i++) {
        if (isPrime[i] && isPrime[N - i]) {
            count++;
        }
    }
    
    console.log(count);
}