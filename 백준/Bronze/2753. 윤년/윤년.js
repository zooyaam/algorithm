const readline = require('readline');
const rl = readline.createInterface({ input: process.stdin });

rl.on('line', (line) => {
    const year = Number(line.trim());
    console.log(isLeapYear(year));
    rl.close();
});

function isLeapYear(y) {
    if ((y % 4 === 0 && y % 100 !== 0) || y % 400 === 0) {
        return 1;
    } else {
        return 0;
    }
}