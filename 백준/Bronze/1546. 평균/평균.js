const fs = require('fs');
let input = fs.readFileSync("/dev/stdin").toString().trim();

let lines = input.split('\n');
let n = Number(lines[0]);
let scores = lines[1].split(' ').map(Number);

function solution(){
    let max = Math.max(...scores);
    
    for(let i = 0; i < n; i++){
        scores[i] = scores[i] / max * 100;
    }
    
    let sum = scores.reduce((acc, val) => acc + val, 0);
    console.log(sum / scores.length);
}

solution();