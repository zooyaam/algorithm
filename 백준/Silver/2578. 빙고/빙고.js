const readline = require('readline');

(async () => {
    const rl = readline.createInterface({ input: process.stdin });
    
    const input = [];
    for await (const line of rl) {
        input.push(line.trim());
        if (input.length === 10) rl.close();
    }
    
    let board = input.slice(0, 5).map((row) => row.split(' ').map(Number));
    let calls = input.slice(5, 10).map((row) => row.split(' ').map(Number)).flat();
    
    function checkBingo() {
        let count = 0;
        
        // 가로줄 검사
        for (let i = 0; i < 5; i++) {
            if (board[i].every(num => num === 0)) count++;
        }
        
        // 세로줄 검사
        for (let j = 0; j < 5; j++) {
            let cols = board.map(row => row[j]);
            if (cols.every(num => num === 0)) count++;
        }
        
        // 대각선 검사 (좌상 -> 우하)
        if ([0, 1, 2, 3, 4].every(i => board[i][i] === 0)) count++;
        
        // 대각선 검사 (우상 -> 좌하)
        if ([0, 1, 2, 3, 4].every(i => board[i][4 - i] === 0)) count++;
        
        return count >= 3;
    }
    
    for (let i = 0; i < 25; i++) {
        const called = calls[i];
        
        for (let j = 0; j < 5; j++) {
            let idx = board[j].indexOf(called);
            if (idx >= 0) {
                board[j][idx] = 0;
            }
        }
        
        if (checkBingo()) return console.log(i + 1);
    }
})();