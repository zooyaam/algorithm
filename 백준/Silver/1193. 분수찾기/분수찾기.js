const fs = require('fs');
const X = fs.readFileSync('/dev/stdin');

function solution() {
    let numer, denom;
    let N = 1;
    while (N * (N + 1) / 2 < X) {
        N++;
    }
    
    const p = X - (N * (N - 1) / 2);
    if(N % 2) {
        numer = N - p + 1;
        denom = p;
    } else {
        numer = p;
        denom = N - p + 1;
    }
    
    console.log(`${numer}/${denom}`)
}

solution();