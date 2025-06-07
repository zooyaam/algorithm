const readline = require('readline');

(async () => {
    const rl = readline.createInterface({ input: process.stdin });
    
    const input = [];
    for await (const line of rl) {
        input.push(line.trim());
        if (input.length === Number(input[0]) * 2 + 1) rl.close();
    }
    
    const T = Number(input.splice(0, 1)[0]);
    for (let i = 0; i < T; i++) {
        const nums = input[i * 2 + 1].split(' ').map(Number);
        console.log(`${Math.min(...nums)} ${Math.max(...nums)}`)
    }
})();