const readline = require('readline');
const rl = readline.createInterface({ input: process.stdin });

const input = [];

rl.on('line', (line) => {
    input.push(line.trim());
}).on('close', () => {
    input.forEach((line) => {
        const N = Number(line);
        console.log(cantor(N));
    });
});

function cantor(n) {
    if (n === 0) return '-';
    
    const prev = cantor(n - 1);
    const space = ' '.repeat(prev.length);
    
    return prev + space + prev;
}