const readline = require("readline");

(async () => {
  const rl = readline.createInterface({ input: process.stdin });

  const input = [];
  for await (const line of rl) {
    input.push(line.trim());
    if (input.length === Number(input[0]) + 1) rl.close();
  }

  const N = Number(input[0]);

  let cnt = 0;
  const set = new Set();

  for (let i = 2; i <= N; i++) {
    if (input[i] === "ENTER") {
      cnt += set.size;
      set.clear();
    } else {
      set.add(input[i]);
    }
  }
  cnt += set.size;

  console.log(cnt);
})();
