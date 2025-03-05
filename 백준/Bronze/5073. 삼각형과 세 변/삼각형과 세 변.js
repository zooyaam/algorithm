const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim();

const lines = input.split('\n').map((line) => line.split(' ').map(Number));

for(let i = 0; i < lines.length - 1; i++) {
    solution(lines[i]);
}

function solution(arr) {
    arr.sort((a, b) => b - a);
    let arrSet = [...new Set(arr)];
    
    if(arr[0] >= arr[1] + arr[2]) return console.log('Invalid');
    if(arrSet.length === 3) {
        console.log('Scalene');
    } else if (arrSet.length === 2) {
        console.log('Isosceles');
    } else {
        console.log('Equilateral')
    }
}