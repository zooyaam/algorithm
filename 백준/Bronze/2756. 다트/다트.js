const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

function getScore(x, y) {
    const r = Math.sqrt(x * x + y * y);
    if (r <= 3) return 100;
    if (r <= 6) return 80;
    if (r <= 9) return 60;
    if (r <= 12) return 40;
    if (r <= 15) return 20;
    return 0;
}

function playDart(input) {
    const T = Number(input[0]);

    for (let i = 1; i <= T; i++) {
        const data = input[i].trim().split(' ').map(Number);
        let p1 = 0;
        let p2 = 0;

        for (let j = 0; j < 6; j++) {
            const x = data[j * 2];
            const y = data[j * 2 + 1];
            const score = getScore(x, y);
            if (j < 3) {
                p1 += score;
            } else {
                p2 += score;
            }
        }

        if (p1 > p2) {
            console.log(`SCORE: ${p1} to ${p2}, PLAYER 1 WINS.`);
        } else if (p2 > p1) {
            console.log(`SCORE: ${p1} to ${p2}, PLAYER 2 WINS.`);
        } else {
            console.log(`SCORE: ${p1} to ${p2}, TIE.`);
        }
    }
}

playDart(input);