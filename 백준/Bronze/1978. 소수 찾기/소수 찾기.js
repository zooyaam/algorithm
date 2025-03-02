const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim();

const line = input.split('\n');
const nums = line[1].split(' ').map(Number);

let count = 0;

for(let i = 0; i < nums.length; i++) {
    if(solution(nums[i])) count++;
}

console.log(count);

function solution(n) {
    if(n === 1) return false;
    if(n === 2) return true;
    if(n % 2 === 0) return false;
    
    for(let j = 3; j <= Math.sqrt(n); j += 2) {
        if(n % j === 0) return false;
    }
    return true;
}

