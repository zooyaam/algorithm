const readline = require('readline');
const rl = readline.createInterface({ input: process.stdin });

rl.on('line', (line) => {
    const N = Number(line.trim());
    
    let i = 1;
    while (i <= N) {
        console.log(i);
        i++;
    }
})