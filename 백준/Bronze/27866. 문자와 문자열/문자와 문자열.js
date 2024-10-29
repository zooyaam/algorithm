const fs = require('fs');
let input = fs.readFileSync("/dev/stdin").toString().trim();

let [s, i] = input.split('\n')

function solution(){
    console.log(s[Number(i - 1)]);
}

solution();