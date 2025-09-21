const readline = require('readline');

(async () => {
    const rl = readline.createInterface({input: process.stdin});
    
    const input = [];
    for await (const line of rl) {
        input.push(line.trim());
        if (input.length === 3) rl.close();
    }
    
    const N = Number(input[0]);
    const nums = input[1].split(' ').map(Number);
    const ops = input[2].split(' ').map(Number);
    
    function applyOp(a, b, opIdx) {
        switch (opIdx) {
            case 0: return a + b;
            case 1: return a - b;
            case 2: return a * b;
            case 3: return Math.trunc(a / b);
        }
    }
    
    function solution(nums, ops) {
        let max = -Infinity;
        let min = Infinity;
        
        function dfs(idx, curr, cnt) {
            if (idx === N) {
                if (curr > max) max = curr;
                if (curr < min) min = curr;
                return;
            }
            
            for (let op = 0; op < 4; op++) {
                if (cnt[op] > 0) {
                    cnt[op]--;
                    
                    const next = applyOp(curr, nums[idx], op);
                    dfs(idx + 1, next, cnt);
                    cnt[op]++;
                }
            }
        }
        
        dfs(1, nums[0], ops.slice());
        console.log(`${max}\n${min}`)
    }
    
    solution(nums, ops);
})();