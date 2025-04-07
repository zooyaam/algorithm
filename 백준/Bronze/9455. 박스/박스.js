const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const T = Number(input[0]);
let line = 1;

for (let t = 0; t < T; t++) {
    const [m, n] = input[line++].split(' ').map(Number);
    const grid = [];
    
    for (let i = 0; i < m; i++) {
        grid.push(input[line++].split(' ').map(Number));
    }
    
    console.log(solution(m, n, grid));
}

function solution(m, n, grid) {
    let d = 0;
    
    for (let col = 0; col < n; col++) {
        let r = m - 1;
        
        for (let row = m - 1; row >= 0; row--) {
            if (grid[row][col] === 1) {
                d += r - row;
                r--;
            }
        }
    }
    
    return d;
}