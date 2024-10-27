const fs = require('fs');
let input = fs.readFileSync("/dev/stdin").toString().trim();

let y = parseInt(input);

function solution(y){
    console.log(y - 543);
}

solution(y);