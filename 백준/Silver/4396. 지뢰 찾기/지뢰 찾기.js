const readline = require('readline');

(async () => {
    const rl = readline.createInterface({ input: process.stdin });
    
    let input = [];
    for await (const line of rl) {
        input.push(line.trim());
        if (input.length === Number(input[0]) * 2 + 1) rl.close();
    }
    
    const n = Number(input[0]);
    const mineField = input.slice(1, n + 1);
    const clickMap = input.slice(n + 1, 2 * n + 1);
    
    let exploded = false; // 지뢰 클릭 여부
    for (let i = 0; i < n; i++) {
        for (let j = 0; j < n; j++) {
            if (clickMap[i][j] === 'x' && mineField[i][j] === '*') {
                exploded = true; 
            }
        }
    }
    
    const dx = [-1, -1, -1, 0, 0, 1, 1, 1];
    const dy = [-1, 0, 1, -1, 1, -1, 0, 1];
    
    function countMines(x, y) {
        let count = 0;
        
        for (let i = 0; i < 8; i++) {
            const nx = x + dx[i];
            const ny = y + dy[i];
            
            if (nx >= 0 && ny >= 0 && nx < n && ny < n) {
                if (mineField[nx][ny] === '*') count++;
            }
        }
        return count;
    }
    
    let result = Array.from({ length: n }, (_, i) => {
        return clickMap[i].split('');
    })
    
    for (let i = 0; i < n; i++) {
        for (let j = 0; j < n; j++) {
            if (clickMap[i][j] === 'x') {
                if (mineField[i][j] === '*') {
                    result[i][j] = '*';
                } else {
                    result[i][j] = countMines(i, j).toString();
                }
            } else {
                result[i][j] = '.';
            }
        }
    }
    
    if (exploded) {
        for (let i = 0; i < n; i++) {
            for (let j = 0; j < n; j++) {
                if (mineField[i][j] === '*') {
                    result[i][j] = '*';
                }
            }
        }
    }
    
    for (let i = 0; i < n; i++) {
        console.log(result[i].join(''));
    }
})();