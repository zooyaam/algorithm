const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim();

const line = input.split('\n');

function solution(n) {
    const divisors = [];
    for(let i = 1; i * i <= n; i++) {
        if(n % i === 0) {
            divisors.push(i);
            if(i !== n / i) {
                divisors.push(n / i);
            }
        }
    }
    divisors.sort((a, b) => a - b);
    divisors.pop();
    
    const sum = divisors.reduce((acc, cur) => acc + cur, 0);
    
    if(sum === n) {
        console.log(`${n} = ${divisors.join(' + ')}`);
    } else {
        console.log(`${n} is NOT perfect.`);
    }
}

for(let j = 0; j < line.length - 1; j++) {
    solution(Number(line[j]));
}
