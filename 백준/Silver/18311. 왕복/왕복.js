const readline = require('readline');

(async () => {
    const rl = readline.createInterface({ input: process.stdin });
    
    let input = [];
    for await (const line of rl) {
        input.push(line.trim());
        if (input.length === 2) rl.close();
    }
    
    const [N, K] = input[0].split(' ').map(Number);
    const course = input[1].split(' ').map(Number);
    const total = course.reduce((acc, cur) => acc + cur, 0);
    
    function solution(k) {
        let sum = 0;
        for (let i = 0; i < N; i++) {
            sum += course[i];
            if (k < sum) {
                return i + 1;
            }
        }
    }
    
    if (K === total) {
        console.log(N);
    } else if (K > total) {
        console.log(solution(2 * total - K));
    } else {
        console.log(solution(K));
    }   
})();