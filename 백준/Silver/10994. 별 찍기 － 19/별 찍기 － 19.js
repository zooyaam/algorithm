const readline = require('readline');
const rl = readline.createInterface({ input: process.stdin });

let result;

rl.on('line', (line) => {
    const N = Number(line.trim());
    const size = 4 * N - 3;
    result = Array.from({ length: size }, () => Array(size).fill(' '));
    
    drawStar(0, 0, N);
    console.log(result.map(row => row.join('')).join('\n'));
    
    rl.close();
});

function drawStar(x, y, n) {
    let size = 4 * n - 3;
    
    for (let i = 0; i < size; i++) {
        // 정사각형 상하
        result[x][y + i] = '*';
        result[x + size - 1][y + i] = '*';
        
        // 정사각형 좌우
        result[x + i][y] = '*';
        result[x + i][y + size - 1] = '*';
    }
    
    if (n > 1) {
        drawStar(x + 2, y + 2, n - 1);
    }
}