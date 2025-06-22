const readline = require('readline');

(async () => {
    const rl = readline.createInterface({ input: process.stdin });
    
    const input = [];
    for await (const line of rl) {
        input.push(line.trim());
        if (input.length === 2) rl.close();
    }
    
    const N = Number(input[0]);
    const map = input[1].split('');
    
    let present = 0;
    for (let i = 0; i < N - 1; i++) {
        if (map[i] === 'E' && map[i + 1] === 'W') {
            present++;
        }
    }
    
    console.log(present);
})();