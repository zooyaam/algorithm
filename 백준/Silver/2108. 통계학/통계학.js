const readline = require('readline');

(async () => {
    const rl = readline.createInterface({ input: process.stdin });
    
    const input = [];
    for await (const line of rl) {
        input.push(line.trim());
        if (input.length === Number(input[0]) + 1) rl.close();
    }
    
    const N = Number(input[0]);
    const num = input.slice(1).map(Number);
    const result = [];
    
    // 산술평균
    const sum = num.reduce((acc, cur) => acc + cur, 0);
    result.push(Math.round(sum / N));
    
    // 중앙값
    num.sort((a, b) => a - b);
    result.push(num[Math.floor(N / 2)]);
    
    // 최빈값
    const map = new Map();
    num.forEach((n) => {
        if (map.has(n)) {
            map.set(n, map.get(n) + 1);
        } else {
            map.set(n, 1);
        }
    });

    let maxFreq = 0;
    map.forEach((v) => {
        if (v > maxFreq) maxFreq = v;
    });

    const candidates = [];
    map.forEach((v, k) => {
        if (v === maxFreq) candidates.push(k);
    });

    candidates.sort((a, b) => a - b);
    result.push(candidates.length > 1 ? candidates[1] : candidates[0]);

    // 범위
    result.push(Math.max(...num) - Math.min(...num));
    
    console.log(result.join('\n'));
})();