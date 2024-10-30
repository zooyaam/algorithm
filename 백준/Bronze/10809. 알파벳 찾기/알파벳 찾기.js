const fs = require('fs');
let input = fs.readFileSync("/dev/stdin").toString().trim();

let S = input;

function solution(str) {
    let result = [];
    for(let i = 97; i < 123; i++){
        result.push(str.indexOf(String.fromCharCode(i)));
    }
    
    console.log(result.join(' '));
}

solution(S);