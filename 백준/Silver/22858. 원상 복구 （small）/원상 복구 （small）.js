const readline = require('readline');

(async () => {
    const rl = readline.createInterface({ input: process.stdin });
    
    const input = [];
    for await (const line of rl) {
        input.push(line.trim());
        if (input.length === 3) rl.close();
    }
    
    const [N, K] = input[0].split(' ').map(Number);
    const S = input[1].split(' ').map(Number);
    const D = input[2].split(' ').map(Number);
    
    let P = Array(N).fill(0);
    for (let i = 0; i < N; i++) {
        let d = i;
        for (let k = 0; k < K; k++) {
          d = D[d] - 1;  
        };
        P[d] = S[i];
    }
    
    console.log(P.join(' '));
})();