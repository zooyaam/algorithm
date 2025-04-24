const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const count = Number(input[0]);
const measure = input[1].split(' ').map(Number);

function solution() {
    if (count === 1) return Math.pow(measure[0], 2);
    
    measure.sort((a, b) => b - a);
    return measure[0] * measure[measure.length - 1];
}

console.log(solution());
