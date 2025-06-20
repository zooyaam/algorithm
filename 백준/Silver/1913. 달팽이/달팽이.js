const readline = require('readline');

(async () => {
    const rl = readline.createInterface({ input: process.stdin });

    const input = [];
    for await (const line of rl) {
        input.push(line.trim());
        if (input.length === 2) rl.close();
    }

    const N = Number(input[0]);
    const find = Number(input[1]);

    let board = Array.from({ length: N }, () => Array(N).fill(0));
    const dx = [-1, 0, 1, 0];
    const dy = [0, 1, 0, -1];

    let x = Math.floor(N / 2);
    let y = Math.floor(N / 2);
    let num = 1;
    let ansX = x + 1;
    let ansY = y + 1;

    board[x][y] = num;

    let len = 1;
    let dir = 0;

    while (num < N * N) {
        for (let i = 0; i < 2; i++) {
            for (let j = 0; j < len; j++) {
                x += dx[dir];
                y += dy[dir];
                num++;
                if (num > N * N) break;
                board[x][y] = num;
                if (num === find) {
                    ansX = x + 1;
                    ansY = y + 1;
                }
            }
            dir = (dir + 1) % 4;
        }
        len++;
    }

    console.log(board.map(row => row.join(' ')).join('\n'));
    console.log(ansX, ansY);
})();
