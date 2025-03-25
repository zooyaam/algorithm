const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const T = Number(input[0]);

function gcd(n, m) {
    let r = 0;
    while (m !== 0) {
        r = n % m;
        n = m;
        m = r;
    }
    return n;
}

for(let i = 1; i <= T; i++) {
    let [N, M] = input[i].split(' ').map(Number);
    console.log(N * M / gcd(N, M)); 
}