const fs = require('fs');
const S = fs.readFileSync('/dev/stdin').toString().trim();

const subStr = new Set();

for (let i = 0; i < S.length; i++) {
    for (let j = i + 1; j <= S.length; j++) {
        subStr.add(S.substring(i, j));
    }
}

console.log(subStr.size);
