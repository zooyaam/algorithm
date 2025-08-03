const readline = require('readline');
const rl = readline.createInterface({ input: process.stdin, output: process.stdout });

rl.on('line', (line) => {
    const N = Number(line.trim());
    solution(N);
    rl.close();
});

function solution(n) {
    let origin = n;
    let current = n;
    let cycle = 0;

    do {
        const tens = Math.floor(current / 10);
        const ones = current % 10;
        const sum = tens + ones;
        current = (ones * 10) + (sum % 10);
        cycle++;
    } while (current !== origin);

    console.log(cycle);
}