const readline = require('readline');
const rl = readline.createInterface({ input: process.stdin });

rl.on('line', (line) => {
    const cries = line.trim().split('');
    console.log(countDucks(cries));
});

function countDucks(cries) {
    const ducks = [];
    const order = 'quack';

    for (const ch of cries) {
        let placed = false;

        for (let i = 0; i < ducks.length; i++) {
            const expectedChar = order[(ducks[i].length) % 5];
            if (ch === expectedChar) {
                ducks[i] += ch;

                if (ducks[i].endsWith('quack')) {
                    ducks[i] = '';
                }
                placed = true;
                break;
            }
        }

        if (!placed) {
            if (ch === 'q') {
                ducks.push('q');
            } else {
                return -1;
            }
        }
    }

    if (ducks.some(d => d !== '')) {
        return -1;
    }
    return ducks.length;
};