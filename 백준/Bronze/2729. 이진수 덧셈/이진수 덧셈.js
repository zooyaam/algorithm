const readline = require('readline');

(async () => {
    const rl = readline.createInterface({ input: process.stdin });

    const input = [];
    for await (const line of rl) {
        input.push(line.trim().split(' '));
        if (input.length === Number(input[0][0]) + 1) rl.close();
    }

    const T = Number(input[0][0]);
    input.splice(0, 1);
    const results = [];

    function trimLeadingZeros(str) {
        let i = 0;
        while (i < str.length - 1 && str[i] === '0') {
            i++;
        }
        return str.slice(i);
    }

    for (let i = 0; i < T; i++) {
        let [a, b] = input[i];
        if (a.length > b.length) {
            b = b.padStart(a.length, '0');
        } else {
            a = a.padStart(b.length, '0');
        }

        let carry = 0;
        let result = '';
        for (let j = a.length - 1; j >= 0; j--) {
            const sum = Number(a[j]) + Number(b[j]) + carry;
            const digit = sum % 2;
            carry = Math.floor(sum / 2);
            result = digit + result;
        }
        if (carry > 0) {
            result = carry + result;
        }
        results.push(trimLeadingZeros(result));
    }
    console.log(results.join('\n'));
})();
