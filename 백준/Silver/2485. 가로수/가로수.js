const fs = require("fs");
const input = fs.readFileSync("/dev/stdin", "utf8").trim().split("\n").map(Number);

const N = input[0];
const positions = input.slice(1);

const gaps = [];
for (let i = 1; i < N; i++) {
    gaps.push(positions[i] - positions[i - 1]);
}

function gcd(a, b) {
    while (b !== 0) {
        [a, b] = [b, a % b];
    }
    return a;
}

let commonGap = gaps[0];
for (let i = 1; i < gaps.length; i++) {
    commonGap = gcd(commonGap, gaps[i]);
}

let result = 0;
for (let gap of gaps) {
    result += (gap / commonGap) - 1;
}

console.log(result);