const readline = require('readline');
const rl = readline.createInterface({ input: process.stdin });

rl.on('line', (line) => {
    const [N, M] = line.trim().split(' ').map(Number);
    const visited = Array(N + 1).fill(false);
    const path = [];

    function backtrack(depth) {
        if (depth === M) {
            console.log(path.join(' '));
            return;
        }

        for (let i = 1; i <= N; i++) {
            if (visited[i]) continue;
            visited[i] = true;
            path.push(i);

            backtrack(depth + 1);

            path.pop();
            visited[i] = false;
        }
    }

    backtrack(0);
    rl.close();
});
