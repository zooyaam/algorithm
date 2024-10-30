const fs = require('fs');
let input = fs.readFileSync("/dev/stdin").toString().trim();

function solution() {
    if(input.length === 0) {
        console.log(0);
        return;
    }
    
    let result = input.split(' ');
    console.log(result.length)
}

solution();