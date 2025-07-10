const readline = require("readline");

(async () => {
  const rl = readline.createInterface({ input: process.stdin });

  const input = [];
  let N, M;
  for await (const line of rl) {
    input.push(line.trim());
    [N, M] = input[0].split(" ").map(Number);
    if (input.length === N + 1) rl.close();
  }

  const words = input.slice(1).filter((w) => w.length >= M);
  const map = new Map();
  words.forEach((word) => {
    if (map.has(word)) map.set(word, map.get(word) + 1);
    else map.set(word, 1);
  });

  const set = new Set(words);
  const result = Array.from(set);

  result.sort((w1, w2) => {
    if (map.get(w2) !== map.get(w1)) {
      return map.get(w2) - map.get(w1);
    } else if (w1.length !== w2.length) {
      return w2.length - w1.length;
    } else {
      return w1.localeCompare(w2);
    }
  });
    
  console.log(result.join("\n"));
})();