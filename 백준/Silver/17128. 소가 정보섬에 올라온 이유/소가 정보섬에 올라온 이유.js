const readline = require('readline');

(async () => {
    const rl = readline.createInterface({ input: process.stdin });

    const input = [];
    for await (const line of rl) {
        input.push(line.trim());
        if (input.length === 3) rl.close();
    }

    const [N, Q] = input[0].split(' ').map(Number);
    const A = input[1].split(' ').map(Number);
    const q_cows = input[2].split(' ').map(x => Number(x) - 1);

    const products = new Array(N);
    let S = 0;
    for (let i = 0; i < N; i++) {
        const prod = A[i % N] * A[(i + 1) % N] * A[(i + 2) % N] * A[(i + 3) % N];
        products[i] = prod;
        S += prod;
    }

    const output = [];

    for (const cow of q_cows) {
        A[cow] *= -1;
        for (let d = 0; d < 4; d++) {
            const start = (cow - d + N) % N;

            const i1 = start;
            const i2 = (start + 1) % N;
            const i3 = (start + 2) % N;
            const i4 = (start + 3) % N;

            const oldProd = products[start];
            const newProd = A[i1] * A[i2] * A[i3] * A[i4];

            S = S - oldProd + newProd;
            products[start] = newProd;
        }

        output.push(S);
    }

    console.log(output.join('\n'));
})();
