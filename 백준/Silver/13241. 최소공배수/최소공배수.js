const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim();

const [A, B] = input.split(' ').map(Number);

function gcd(a, b) {
    let r = 0;
    while (b !== 0) {
        r = a % b;
        a = b;
        b = r;
    }
    return a;
}

console.log(A * B / gcd(A, B));