const fs = require('fs');
const N = Number(fs.readFileSync('/dev/stdin'));

function solution() {
    let result = 0;
    for(let i = Math.max(1, N-54); i < N; i++) {
        let sum = i + String(i).split('').reduce((acc, digit) => acc + parseInt(digit), 0);

        if (sum === N) {
            result = i;
            break;
        }
    }
    console.log(result);
}

solution();