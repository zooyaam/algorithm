const fs = require('fs');
let input = fs.readFileSync("/dev/stdin").toString().trim();

let lines = input.split('\n');
let N = Number(lines[0].split(' ')[0]);

let A = lines.slice(1, N + 1).map(line => line.split(' ').map(Number));
let B = lines.slice(N + 1, 2 * N + 1).map(line => line.split(' ').map(Number));

function solution(A, B) {
    let result = A.map((row, i) => 
        row.map((value, j) => value + B[i][j])
    );
    
    console.log(result.map(row => row.join(' ')).join('\n'));
}

solution(A, B);
