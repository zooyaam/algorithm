const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const T = Number(input[0]);
const result = [];

function combination(n, m) {
    if (n === m) return 1;
    
    let res = 1;
    if (n > m - n) n = m - n;
    for (let i = 1; i <= n; i++) {
        res *= (m - i + 1);
        res /= i;
    }
    return res;
}

for (let i = 1; i <= T; i++) {
    const [N, M] = input[i].split(' ').map(Number);
    result.push(combination(N, M));
}
console.log(result.join('\n'));