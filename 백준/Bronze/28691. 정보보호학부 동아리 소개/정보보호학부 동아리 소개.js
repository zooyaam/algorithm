const readline = require('readline');
const rl = readline.createInterface({ input: process.stdin });

const club = {
    M : 'MatKor',
    W: 'WiCys',
    C: 'CyKor',
    A: 'AlKor',
    $: '$clear'
}

rl.on('line', (line) => {
    const char = line.trim();
    console.log(club[line]);
    rl.close;
})