const readline = require('readline');

(async () => {
    const rl = readline.createInterface({ input: process.stdin });
    
    const input = [];
    for await (const line of rl) {
        input.push(line.trim());
        if (input.length === Number(input[0]) + 1) rl.close();
    }
    
    const N = Number(input[0]);
    const dancing = new Set(['ChongChong']);
    for (let i = 1; i <= N; i++) {
        const people = input[i].split(' ');
        if (dancing.has(people[0]) || dancing.has(people[1])) {
            dancing.add(people[0]);
            dancing.add(people[1]);
        }
    }
    
    console.log(dancing.size);
})();