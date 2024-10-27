const fs = require('fs');
let input = fs.readFileSync("/dev/stdin").toString().trim();

let numbers = input.split('\n').map(Number);

function solution(list){
    let attendances = Array.from({length: 30}, (_, i) => i + 1);
    
    list.sort((a, b) => a - b);
    const missing = attendances.filter(num => !list.includes(num));
    
    console.log(missing.join('\n'))
}

solution(numbers);