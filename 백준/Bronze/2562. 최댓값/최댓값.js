const fs = require('fs');
let input = fs.readFileSync("/dev/stdin").toString().trim();

let numList = input.split('\n').map(Number);

function solution(list){
    let max = Math.max(...list);
    console.log(max);
    console.log(list.indexOf(max) + 1);
}

solution(numList);