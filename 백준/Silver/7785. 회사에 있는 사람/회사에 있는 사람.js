const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const logs = new Map();

for (let i = 1; i < input.length; i++) {
  const [name, action] = input[i].split(' ');

  if (action === 'enter') {
    logs.set(name, true);
  } else if (action === 'leave') {
    logs.delete(name);
  }
}

const result = [...logs.keys()].sort().reverse();
console.log(result.join('\n'));
