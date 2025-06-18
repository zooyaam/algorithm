const readline = require('readline');

(async () => {
    const rl = readline.createInterface({ input: process.stdin });
    
    const input = [];
    for await (const line of rl) {
        input.push(line.trim());
        if (input.length === 2) rl.close();
    }
    
    const [sl, sr] = input[0].split(' ');
    const word = input[1];
    const keyPos = {
        q: [0, 0], w: [0, 1], e: [0, 2], r: [0, 3], t: [0, 4], y: [0, 5], u: [0, 6], i: [0, 7], o: [0, 8], p: [0, 9],
        a: [1, 0], s: [1, 1], d: [1, 2], f: [1, 3], g: [1, 4], h: [1, 5], j: [1, 6], k: [1, 7], l: [1, 8],
        z: [2, 0], x: [2, 1], c: [2, 2], v: [2, 3], b: [2, 4], n: [2, 5], m: [2, 6]
    }
    const leftKeys = new Set(['q', 'w', 'e', 'r', 't', 'a', 's', 'd', 'f', 'g', 'z', 'x', 'c', 'v']);
    const rightKeys = new Set(['y', 'u', 'i', 'o', 'p', 'h', 'j', 'k', 'l', 'b', 'n', 'm']);
    
    function calcDistance(pos1, pos2) {
        return Math.abs(pos1[0] - pos2[0]) + Math.abs(pos1[1] - pos2[1]);
    }
    
    let l = keyPos[sl];
    let r = keyPos[sr];
    let time = 0;
    for (let char of word) {
        if (leftKeys.has(char)) {
            time += calcDistance(l, keyPos[char]) + 1;
            l = keyPos[char];
        } else {
            time += calcDistance(r, keyPos[char]) + 1;
            r = keyPos[char];
        }
    }
    
    console.log(time);
})();