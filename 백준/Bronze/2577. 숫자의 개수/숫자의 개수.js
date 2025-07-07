const readline = require('readline');

(async () => {
    const rl = readline.createInterface({ input: process.stdin });
    
    const input = [];
    for await (const line of rl) {
        input.push(Number(line.trim()));
        if (input.length === 3) rl.close();
    }
    
    const [A, B, C] = input;
    const product = A * B * C;
    const arr = String(product).split('');
    
    const map = new Map();
    arr.forEach((num) => {
        if (map.has(num)) {
            map.set(num, map.get(num) + 1);
        } else {
            map.set(num, 1);
        }
    });
    
    const result = [];
    for (let i = 0; i < 10; i++) {
        const digit = String(i);
        result.push(map.get(digit) || 0);
    }
    
    console.log(result.join('\n'));
})();
