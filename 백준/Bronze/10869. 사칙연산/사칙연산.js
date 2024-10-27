const fs = require('fs');
let input = fs.readFileSync("/dev/stdin").toString().trim();

let [a, b] = input.split(' ').map(Number);

function solution(a, b){
    console.log(a + b);
    console.log(a - b);
    console.log(a * b);
    console.log(~~(a / b));
    console.log(a % b);
}

solution(a, b)