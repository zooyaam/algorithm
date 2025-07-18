const readline = require('readline');
const rl = readline.createInterface({ input: process.stdin });

rl.on('line', (line) => {
    const N = Number(line.trim());
    const arr = Array.from({ length: N }, () => Array(N).fill(' '));

    fillStars(arr, 0, 0, N);
    console.log(arr.map(row => row.join('')).join('\n'));

    rl.close();
});

function fillStars(arr, x, y, size) {
    if (size === 1) {
        arr[y][x] = '*';
        return;
    }

    const newSize = size / 3;

    for (let dy = 0; dy < 3; dy++) {
        for (let dx = 0; dx < 3; dx++) {
            if (dy === 1 && dx === 1) {
                continue;
            }
            fillStars(arr, x + dx * newSize, y + dy * newSize, newSize);
        }
    }
}
