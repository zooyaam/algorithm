const readline = require('readline');

(async () => {
    const rl = readline.createInterface({ input: process.stdin });
    
    const input = [];
    let N, M;
    for await (const line of rl) {
        input.push(line);
        [N, M] = input[0].split(' ').map(Number);
        if (input.length === M + 2) rl.close();
    }
    
    let bulbs = input[1].split(' ').map(Number);
    for (let i = 2; i < M + 2; i++) {
        const [a, b, c] = input[i].split(' ').map(Number);
        toggleLight(a, b, c, bulbs);
    }
    console.log(bulbs.join(' '));
})();

function toggleLight (a, b, c, bulbs) {
    switch(a) {
        case 1:
            bulbs[b - 1] = c;
            break;
        case 2:
            for (let i = b - 1; i < c; i++) {
                bulbs[i] = bulbs[i] ? 0 : 1;
            }
            break;
        case 3:
            for (let i = b - 1; i < c; i++) {
                bulbs[i] = 0;
            }
            break;
        case 4:
            for (let i = b - 1; i < c; i++) {
                bulbs[i] = 1;
            }
            break;
    }
}