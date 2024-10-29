const fs = require('fs');
let input = fs.readFileSync("/dev/stdin").toString().trim();

let word = input;

function solution(){
    console.log(word.length)
}

solution();