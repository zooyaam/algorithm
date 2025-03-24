const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const [N, M] = input[0].split(' ').map(Number);
const arr1 = new Set(input.slice(1, N + 1));
const arr2 = new Set(input.slice(N + 1));

function solution() {
    const result = [...arr1].filter(name => arr2.has(name)).sort();
    console.log(result.length);
    console.log(result.join('\n'));
}

solution();