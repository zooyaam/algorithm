const readline = require('readline');

(async () => {
    const rl = readline.createInterface({ input: process.stdin });
    
    let input = [];
    for await (const line of rl) {
        input.push(line.trim());
        if (input.length === 2) rl.close();
    }
    
    let money = Number(input[0]);
    let stock = input[1].split(' ').map(Number);
    
    function bnp() {
        let cash = money;
        let cnt = 0;
        for (let price of stock) {
            let buy = Math.floor(cash / price);
            cnt += buy;
            cash -= price * buy; 
        }
        return cash + stock[13] * cnt;
    }
    
    function timing() {
        let cash = money;
        let cnt = 0;
        for (let i = 3; i < stock.length; i++) {
            if (stock[i - 3] < stock[i - 2] && stock[i - 2] < stock[i - 1]) {
                cash += cnt * stock[i];
                cnt = 0;
            } else if (stock[i - 1] < stock[i - 2] && stock[i - 2] < stock[i - 3]) {
                let buy = Math.floor(cash / stock[i]);
                cnt += buy;
                cash -= stock[i] * buy;
            }
        }
        return cash + stock[13] * cnt;
    }
    
    if (bnp() > timing()) {
        console.log('BNP');
    } else if (bnp() < timing()) {
        console.log('TIMING');
    } else {
        console.log('SAMESAME')
    }
})();