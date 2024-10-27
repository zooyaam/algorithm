const fs = require('fs');
let input = fs.readFileSync("/dev/stdin").toString().trim();

let id = input;

function solution(id){
    console.log(id + '??!');
}

solution(id)