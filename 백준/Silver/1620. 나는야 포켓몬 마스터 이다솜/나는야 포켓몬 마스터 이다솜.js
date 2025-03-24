const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const [N, M] = input[0].split(' ').map(Number);
const book = input.slice(1, N + 1);
const quiz = input.slice(N + 1);

const nameToNum = {};

for (let i = 0; i < N; i++) {
    nameToNum[book[i]] = i + 1;
}

for (let i = 0; i < M; i++) {
    if (isNaN(quiz[i])) {
        console.log(nameToNum[quiz[i]]);
    } else {
        console.log(book[Number(quiz[i]) - 1]);
    }
}
