const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim();

const N = Number(input);
const queue = Array.from({ length: N }, (_, i) => i + 1);

let front = 0;

while (queue.length - front > 1) {
    front++;
    queue.push(queue[front++]);
}

console.log(queue[front]);
