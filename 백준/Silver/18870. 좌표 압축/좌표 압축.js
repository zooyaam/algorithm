const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim();

const line = input.split('\n');
const X = line[1].split(' ').map(Number);
const sortX = [...new Set(X)].sort((a, b) => a - b);

function solution() {
    const indexMap = new Map();
    sortX.forEach((num, index) => indexMap.set(num, index));

    const result = X.map(num => indexMap.get(num));
    console.log(result.join(' '));
}

solution();