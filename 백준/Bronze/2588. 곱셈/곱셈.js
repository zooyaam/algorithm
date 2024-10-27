const fs = require('fs');
let input = fs.readFileSync("/dev/stdin").toString().trim();

let [a, b] = input.split('\n').map(Number);

function solution(a, b){
    console.log(a * (b % 10));
    console.log(a * Math.floor((b / 10) % 10));
    console.log(a * Math.floor(b / 100));
    console.log(a * b);
}

solution(a, b);
