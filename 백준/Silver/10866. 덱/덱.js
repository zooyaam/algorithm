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

    const deque = Array(20000);
    let head = 10000;
    let tail = 10000;

    const output = [];

    for (const cmdLine of cmds) {
        const [cmd, val] = cmdLine.split(' ');

        switch (cmd) {
            case 'push_front':
                deque[--head] = Number(val);
                break;
            case 'push_back':
                deque[tail++] = Number(val);
                break;
            case 'pop_front':
                if (head === tail) {
                    output.push(-1);
                } else {
                    output.push(deque[head++]);
                }
                break;
            case 'pop_back':
                if (head === tail) {
                    output.push(-1);
                } else {
                    output.push(deque[--tail]);
                }
                break;
            case 'size':
                output.push(tail - head);
                break;
            case 'empty':
                output.push(head === tail ? 1 : 0);
                break;
            case 'front':
                output.push(head === tail ? -1 : deque[head]);
                break;
            case 'back':
                output.push(head === tail ? -1 : deque[tail - 1]);
                break;
        }
    }

    console.log(output.join('\n'));
})();
