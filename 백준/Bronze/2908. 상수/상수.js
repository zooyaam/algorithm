const fs = require('fs');
let input = fs.readFileSync("/dev/stdin").toString().trim();

let [A, B] = input.split(' ').map(Number);

function solution(A, B) {
    let reversedA = Number(A.toString().split('').reverse().join(''));
    let reversedB = Number(B.toString().split('').reverse().join(''));
    
    console.log(reversedA > reversedB ? reversedA : reversedB);
}

solution(A, B);
