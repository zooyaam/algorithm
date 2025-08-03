const readline = require('readline');
const rl = readline.createInterface({ input: process.stdin });

let output = [];

function hanoi(n, start, end, via) {
  if (n === 1) {
    output.push(`${start} ${end}`);
    return;
  }

  hanoi(n - 1, start, via, end);
  output.push(`${start} ${end}`);
  hanoi(n - 1, via, end, start);
}

rl.on('line', (line) => {
  const N = Number(line.trim());
  output.push(`${2 ** N - 1}`);
    
  hanoi(N, 1, 3, 2);
  console.log(output.join('\n'));
  rl.close();
});
