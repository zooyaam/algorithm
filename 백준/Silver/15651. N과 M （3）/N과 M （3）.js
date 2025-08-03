const readline = require('readline');
const rl = readline.createInterface({ input: process.stdin });

rl.on('line', (line) => {
    const [N, M] = line.trim().split(' ').map(Number);
    
    const result = [];
    const sequence = [];

    function backtrack(depth) {
        if (depth === M) {
            result.push(sequence.join(' '));
            return;
        }

        for (let i = 1; i <= N; i++) {
            sequence[depth] = i;
            backtrack(depth + 1);
        }
    }

    backtrack(0);
    console.log(result.join('\n'));

    rl.close();
})