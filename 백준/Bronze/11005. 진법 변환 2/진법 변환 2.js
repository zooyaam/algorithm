const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim();

const [N, B] = input.split(' ');

function solution(N, B) {
    console.log(N.toString(B).toUpperCase())
}

solution(Number(N), Number(B));