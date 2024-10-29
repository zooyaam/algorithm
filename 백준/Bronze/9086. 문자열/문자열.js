const fs = require('fs');
let input = fs.readFileSync("/dev/stdin").toString().trim().split('\n');

let n = Number(input[0]);
let strings = input.slice(1);

function solution(){
    for(let i = 0; i < n; i++){
        let string = strings[i]
        console.log(string[0] + string[string.length - 1])
    }
}

solution();