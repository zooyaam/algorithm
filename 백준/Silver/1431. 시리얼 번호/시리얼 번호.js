const readline = require('readline');

(async () => {
    const rl = readline.createInterface({ input: process.stdin });
    
    const input = [];
    for await (const line of rl) {
        input.push(line.trim());
        if (input.length === Number(input[0]) + 1) rl.close();
    }
    
    const N = Number(input[0]);
    const serial = input.slice(1);
    
    serial.sort((a, b) => {
        if (a.length !== b.length) {
            return a.length - b.length;
        } else {
            const aSum = a
                .split('')
                .filter(ch => /\d/.test(ch))
                .reduce((sum, ch) => sum + Number(ch), 0);
            const bSum = b
                .split('')
                .filter(ch => /\d/.test(ch))
                .reduce((sum, ch) => sum + Number(ch), 0);

            if (aSum !== bSum) {
                return aSum - bSum;
            } else {
                return a.localeCompare(b);
            }
        }
    });

    console.log(serial.join('\n'));
})();
