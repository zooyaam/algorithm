const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim();

const [x, y, w, h] = input.split(' ').map(Number);

function solution() {
    const min = Math.min(x, w - x, y, h - y);
    console.log(min);
}

solution();
