const readline = require('readline');
const rl = readline.createInterface({ input: process.stdin });

rl.on('line', (line) => {
    const n = Number(line.trim());

    let fibCount = 0;
    let dpCount = 0;

    // 재귀
    function fib(n) {
        if (n === 1 || n === 2) {
            fibCount++;
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    // DP
    function fibonacci(n) {
        const f = [];
        f[1] = f[2] = 1;
        for (let i = 3; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
            dpCount++;
        }
        return f[n];
    }

    fib(n);
    fibonacci(n);
    console.log(fibCount, dpCount);
});
