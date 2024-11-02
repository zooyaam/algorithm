const fs = require("fs");
let input = fs.readFileSync("/dev/stdin").toString().trim();

let array = input.split(" ").map(Number);

function solution(arr){
    let piece = [1, 1, 2, 2, 2, 8];
    
    for(let i = 0; i < piece.length; i++){
        piece[i] -= arr[i];
    }
    console.log(piece.join(' '));
}

solution(array);