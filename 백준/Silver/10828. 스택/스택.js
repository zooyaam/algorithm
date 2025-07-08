const readline = require('readline');

(async () => {
    const rl = readline.createInterface({ input: process.stdin });
    
    const input = [];
    for await (const line of rl) {
        input.push(line.trim());
        if (input.length === Number(input[0]) + 1) rl.close();
    }
    
    const N = Number(input[0]);
    const cmds = input.slice(1);
    
    let i = 0;
    let stack = [];
    let output = [];
    while (i < N) {
        const [cmd, num] = cmds[i].split(' ');
        
        switch (cmd) {
            case 'push' :
                stack.push(Number(num));
                break;
            case 'pop' :
                output.push(stack.length ? stack.pop() : -1);
                break;
            case 'size' :
                output.push(stack.length);
                break;
            case 'empty' :
                output.push(stack.length ? 0 : 1);
                break;
            case 'top' :
                output.push(stack.length ? stack[stack.length - 1] : -1);
                break;
        }
        i++;
    }
    
    console.log(output.join('\n'));
})();