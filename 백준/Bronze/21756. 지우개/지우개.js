const readline = require('readline');
const rl = readline.createInterface({ input: process.stdin });

rl.on('line', (line) => {
    const N = Number(line.trim());
    console.log(eraser(N));
    rl.close();
});

function eraser(n) {
    let power = 1;
    while (power * 2 <= n) {
        power *= 2;
    }
    return power;
}