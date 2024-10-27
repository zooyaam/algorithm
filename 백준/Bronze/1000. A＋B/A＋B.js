const fs = require('fs');
let input = fs.readFileSync("/dev/stdin").toString().trim();

let [a, b] = input.split(' ').map(Number);

function solution(a, b){
    let ans = a + b;
    return ans;
}

console.log(solution(a, b));