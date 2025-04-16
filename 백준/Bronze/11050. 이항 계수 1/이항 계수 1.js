const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim();

const [N, K] = input.split(' ').map(Number);

function combination(n, k) {
    if (k < 0 || k > n) return 0;
    if (k === 0 || k === n) return 1;
    
    let result = 1;
    if (k > n - k) k = n - k;
    for (let i = 1; i <= k; i++) {
        result *= (n - i + 1);
        result /= i;
    }
    return result;
}

console.log(combination(N, K));