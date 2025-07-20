const readline = require('readline');
const rl = readline.createInterface({ input: process.stdin });

rl.on('line', (line) => {
  const [N, M] = line.trim().split(' ').map(Number);
  const result = [];
  const visited = Array(N + 1).fill(false);

  function backtrack(start, arr) {
    if (arr.length === M) {
      console.log(arr.join(' '));
      return;
    }

    for (let i = start; i <= N; i++) {
      if (!visited[i]) {
        visited[i] = true;
        backtrack(i + 1, [...arr, i]);
        visited[i] = false;
      }
    }
  }

  backtrack(1, []);
});
