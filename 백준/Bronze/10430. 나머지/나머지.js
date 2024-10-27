const fs = require('fs');
let input = fs.readFileSync("/dev/stdin").toString().trim();

let [a, b, c] = input.split(' ').map(Number);

function solution(a, b, c){
    console.log((a + b) % c);
    console.log(((a % c) + (b % c)) % c);
    console.log((a * b) % c);
    console.log(((a % c) * (b % c)) % c);
}

solution(a, b, c);