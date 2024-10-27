const fs = require('fs');
let input = fs.readFileSync("/dev/stdin").toString().trim();

let numbers = input.split('\n').map(Number);

function solution(list){
    list = list.map((num) => num = num % 42);
    let result = [...new Set(list)];
    
    console.log(result.length);
}

solution(numbers);