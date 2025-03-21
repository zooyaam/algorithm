const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim();

const N = Number(input);

function solution() {
    let bags = 0;
    let fiveKg = Math.floor(N / 5);

    while (fiveKg >= 0) {
        let remaining = N - (fiveKg * 5);

        if (remaining % 3 === 0) {
            bags = fiveKg + (remaining / 3);
            console.log(bags);
            return;
        }
        fiveKg--;
    }
    console.log(-1);
}

solution();
