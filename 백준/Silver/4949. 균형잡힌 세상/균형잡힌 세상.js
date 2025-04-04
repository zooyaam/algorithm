const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

input.pop();
const parentheses = ['[', ']', '(', ')'];

const isBalanced = (str) => {
    let stack = [];
    
    for (let char of str) {
        if (char === '(' || char === '[') {
            stack.push(char);
        } else if (char === ')') {
            if (stack.length === 0 || stack.pop() !== '(') return 'no';
        } else if (char === ']') {
            if (stack.length === 0 || stack.pop() !== '[') return 'no';
        }
    }
    
    return stack.length === 0 ? 'yes' : 'no';
};

for (let line of input) {
    const filtered = line.split("").filter(c => parentheses.includes(c)).join("");
    console.log(isBalanced(filtered));
}
