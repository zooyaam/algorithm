const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim();

const line = input.split('\n');
const n = line[0];
const grid = Array.from(Array(100), () => Array(100).fill(0));

function solution(x, y) {
    for(let row = y; row < y+10; row++) {
        for(let col = x; col < x+10; col++) {
            grid[row][col] = 1;
        }
    }
}

for (let i = 1; i <= n; i++) {
    let [x, y] = line[i].split(" ").map(Number);
    solution(x, y);
}

let area = 0;
for (let row = 0; row < 100; row++) {
    for (let col = 0; col < 100; col++) {
        if (grid[row][col] === 1) area++;
    }
}

console.log(area);
