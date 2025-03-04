const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const dots = input.slice(1).map(line => line.split(' ').map(Number));
const x = dots.map(dot => dot[0]);
const y = dots.map(dot => dot[1]);

function solution() {
    const width = Math.max(...x) - Math.min(...x);
    const height = Math.max(...y) - Math.min(...y);
    
    console.log(width * height);
}

solution();