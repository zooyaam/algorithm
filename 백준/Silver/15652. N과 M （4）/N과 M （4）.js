const readline = require('readline');
const rl = readline.createInterface({ input: process.stdin });

rl.on('line', (line) => {
    const [N, M] = line.trim().split(' ').map(Number);
    const result = [];
    const sequence = [];

    function backtrack(depth, start) {
        if (depth === M) {
            result.push(sequence.join(' '));
            return;
        }

        for (let i = start; i <= N; i++) {
            sequence[depth] = i;
            backtrack(depth + 1, i);
        }
    }

    backtrack(0, 1);
    console.log(result.join('\n'));

    rl.close();
})