const readline = require('readline');

(async () => {
    const rl = readline.createInterface({ input: process.stdin });
    
    const input = [];
    for await (const line of rl) {
        input.push(line.trim().split(' ').map(Number));
        if (input.length === input[0][0] + 1) rl.close();
    }

    const N = input.splice(0, 1)[0][0];
    let count = 0;
    const cowMap = new Map();

    for (let i = 0; i < N; i++) {
        const [cow, pos] = input[i];

        if (!cowMap.has(cow)) {
            cowMap.set(cow, pos);
        } else {
            if (cowMap.get(cow) !== pos) {
                count++;
                cowMap.set(cow, pos);
            }
        }
    }

    console.log(count);
})();
