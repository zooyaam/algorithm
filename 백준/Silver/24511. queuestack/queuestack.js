const readline = require('readline');

(async () => {
    const rl = readline.createInterface({ input: process.stdin });
    
    const input = [];
    for await (const line of rl) {
        input.push(line.trim());
        if (input.length === 5) rl.close();
    }
    
    const N = Number(input[0]);
    const A = input[1].split(' ').map(Number);
    const B = input[2].split(' ').map(Number);
    const M = Number(input[3]);
    const C = input[4].split(' ').map(Number);
    
    let result = [];
    for (let i = 0; i < N; i++) {
        if (!A[i]) result.push(B[i]);
    }
    
    console.log(result.reverse().concat(C).slice(0, M).join(' '));
})();