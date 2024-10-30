const fs = require('fs');
let input = fs.readFileSync("/dev/stdin").toString().trim();

let lines = input.split('\n');
let N = Number(lines[0]);
let numbers = lines[1].split('').map(Number);

function solution(N, list) {
    let sum = 0;
    for(let i = 0; i < N; i++){
        sum += list[i];
    }
    
    console.log(sum);
}

solution(N, numbers)