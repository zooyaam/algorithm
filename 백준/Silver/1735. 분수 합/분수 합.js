const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const [numer1, denom1] = input[0].split(' ').map(Number);
const [numer2, denom2] = input[1].split(' ').map(Number);

const numer = numer1 * denom2 + numer2 * denom1;
const denom = denom1 * denom2;

function getGCD(a, b) {
    let r = 0;
    while (b !== 0) {
        r = a % b;
        a = b;
        b = r;
    }
    return a;
}

const gcd = getGCD(numer, denom);
console.log(`${numer / gcd} ${denom/gcd}`);