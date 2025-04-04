const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const T = Number(input[0]);

for (let i = 1; i <= T; i++) {
    const [N, M] = input[i].split(' ').map(Number);
    const U = 2 * M - N
    console.log(`${U} ${M - U}`)
}