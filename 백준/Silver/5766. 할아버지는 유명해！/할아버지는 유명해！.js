const readline = require('readline');

(async () => {
    const rl = readline.createInterface({ input: process.stdin });
    
    const input = [];
    for await (const line of rl) {
        input.push(line.trim());
        if (line.trim() === '0 0') rl.close();
    }
    
    let i = 0
    while (i < input.length - 1) {
        let [N, M] = input[i++].split(' ').map(Number);
        let weekRanks = input.slice(i, i + N);
        i += N;
        
        const voteMap = new Map();
        for (let ranks of weekRanks) {
            const players = ranks.split(' ').map(Number);
            for (let player of players) {
                voteMap.set(player, (voteMap.get(player) || 0) + 1);
            }
        }
        
        const sortedMap = [...voteMap.entries()].sort((a, b) => b[1] - a[1]);
        const secondScore = sortedMap[1][1];
        const secondPlace = sortedMap
            .filter(([_, score]) => score === secondScore)
            .map(([player]) => player)
            .sort((a, b) => a - b);
        
        console.log(secondPlace.join(' '));
    }
})();