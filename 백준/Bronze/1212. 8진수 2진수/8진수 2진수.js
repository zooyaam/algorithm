const readline = require('readline');
const rl = readline.createInterface({ input: process.stdin });

rl.on('line', (line) => {
    const octal = line.trim();
    console.log(toBinary(octal));
    rl.close();
});

function toBinary(num) {
    let binary = '';
    for (let i = 0; i < num.length; i++) {
        const bin = parseInt(num[i], 8).toString(2);
        binary += (i === 0 ? bin : bin.padStart(3, '0'));
    }
    return binary;
}