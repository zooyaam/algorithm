const fs = require('fs');
const N = fs.readFileSync('/dev/stdin')

function solution() {
    let e = 1;
    let l = 1;
    
    while (N > e) {
        e += 6 * l;
        l++;
    }
    console.log(l);
}

solution()