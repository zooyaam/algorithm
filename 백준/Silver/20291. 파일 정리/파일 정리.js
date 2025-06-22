const readline = require('readline');

(async () => {
    const rl = readline.createInterface({ input: process.stdin });
    
    const input = [];
    for await (const line of rl) {
        input.push(line.trim());
        if (input.length === Number(input[0]) + 1) rl.close();
    };
    
    const N = Number(input[0]);
    const files = input.slice(1).map(file => file.split('.').pop());
    
    const map = new Map();
    for (const file of files) {
        if (map.has(file)) {
            map.set(file, map.get(file) + 1);
        } else {
            map.set(file, 1);
        };
    }
    
    const result = Array.from(map);
    result.sort((a, b) => a[0].localeCompare(b[0]));
    
    console.log(result.map(file => file.join(' ')).join('\n'));
})();