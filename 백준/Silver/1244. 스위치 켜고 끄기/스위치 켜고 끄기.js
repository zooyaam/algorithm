const readline = require('readline');

(async () => {
    const rl = readline.createInterface({ input: process.stdin });
    
    let input = [];
    for await (const line of rl) {
        input.push(line.trim());
        if (input.length === Number(input[2]) + 3) rl.close();
    }
    
    const switchCount = Number(input[0]);
    let switchState = input[1].split(' ').map(Number);
    const studentCount = Number(input[2]);
    
    function toggleSwitch(sex, n) {
        const standard = n - 1;
        
        if (sex === 1) {
            for (let i = standard; i < switchCount; i += n) {
                switchState[i] = 1 - switchState[i];
            }
        } else if (sex === 2) {
            switchState[standard] = 1 - switchState[standard];
            
            let offset = 1;
            while (
                standard - offset >= 0 &&
                standard + offset < switchCount &&
                switchState[standard - offset] === switchState[standard + offset]
            ) {
                switchState[standard - offset] = 1 - switchState[standard - offset];
                switchState[standard + offset] = 1 - switchState[standard + offset];
                offset++;
            }
        }
    }
    
    for (let i = 0; i < studentCount; i++) {
        const [sex, num] = input[i + 3].split(' ').map(Number);
        toggleSwitch(sex, num);
    }
    
    for (let i = 0; i < switchCount; i += 20) {
        console.log(switchState.slice(i, i + 20).join(' '));
    }
})();