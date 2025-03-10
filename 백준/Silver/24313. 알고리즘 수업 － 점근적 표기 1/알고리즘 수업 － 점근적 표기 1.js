const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split("\n");

const [a1, a0] = input[0].split(" ").map(Number);
const c = Number(input[1]);
const n0 = Number(input[2]);

const leftSide = (a1 - c) * n0 + a0;

if (a1 <= c && leftSide <= 0) {
    console.log(1);
} else {
    console.log(0);
}
