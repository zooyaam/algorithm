const fs = require('fs');
let input = fs.readFileSync("/dev/stdin").toString().trim();

let lines = input.split('\n');
let T = Number(lines[0]);

function solution(T) {
    let result = [];
    
    for(let i = 1; i <= T; i++){
        let [R, S] = lines[i].split(' ');
        let P = '';
        
        for(const char of S) {
            P += char.repeat(Number(R));
        }
        result.push(P);
    }
    console.log(result.join('\n'))
}

solution(T);
