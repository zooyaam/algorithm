const readline = require('readline');

(async () => {
    const rl = readline.createInterface({ input: process.stdin });
    
    const input = [];
    let N, M;
    for await (const line of rl) {
        input.push(line.trim());
        [N, M] = input[0].split(' ').map(Number);
        if (input.length === M + 1) rl.close();
    };
    
    let trains = Array.from({ length: N }, () => Array(20).fill(0));
    
    function runCommand(cmd, i, x) {
        switch(cmd) {
            case 1: 
                trains[i][x] = 1;
                break;
            case 2:
                trains[i][x] = 0;
                break;
            case 3:
                for (let j = 19; j > 0; j--) {
                    trains[i][j] = trains[i][j - 1]; 
                }
                trains[i][0] = 0;
                break;
            case 4:
                for (let j = 0; j < 19; j++) {
                    trains[i][j] = trains[i][j + 1];
                }
                trains[i][19] = 0;
                break;
        }
    };
    
    for (let m = 1; m <= M; m++) {
        const parts = input[m].split(' ').map(Number);
        const cmd = parts[0];
        const trainIdx = parts[1] - 1;
        const seat = parts[2] !== undefined ? parts[2] - 1 : null;

        runCommand(cmd, trainIdx, seat);
    }
    
    trains = trains.map(train => train.join(''));
    const set = new Set(trains);
    
    console.log(set.size);
})();