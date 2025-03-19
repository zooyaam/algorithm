const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim();

const line = input.split('\n');
const arr1 = line[1].split(' ');
const arr2 = line[3].split(' ');

function solution() {
    let result = [];
    const map = new Map(arr1.map(num => [num, 1]));
    
    for(let i = 0; i < arr2.length; i++) {
        result.push(map.get(arr2[i]) ?? 0)
    }
    console.log(result.join(' '));
}

solution();