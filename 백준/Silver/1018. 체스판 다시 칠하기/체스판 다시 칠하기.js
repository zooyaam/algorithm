const fs = require("fs");
const input = fs.readFileSync("/dev/stdin").toString().trim().split("\n");

const [N, M] = input[0].split(" ").map(Number);
const board = input.slice(1);

const chess1 = [
  "WBWBWBWB",
  "BWBWBWBW",
  "WBWBWBWB",
  "BWBWBWBW",
  "WBWBWBWB",
  "BWBWBWBW",
  "WBWBWBWB",
  "BWBWBWBW",
];

const chess2 = [
  "BWBWBWBW",
  "WBWBWBWB",
  "BWBWBWBW",
  "WBWBWBWB",
  "BWBWBWBW",
  "WBWBWBWB",
  "BWBWBWBW",
  "WBWBWBWB",
];

function countRepaints(x, y) {
  let count1 = 0;
  let count2 = 0;

  for (let i = 0; i < 8; i++) {
    for (let j = 0; j < 8; j++) {
      if (board[x + i][y + j] !== chess1[i][j]) count1++;
      if (board[x + i][y + j] !== chess2[i][j]) count2++;
    }
  }
  return Math.min(count1, count2);
}

let minRepaints = Infinity;

for (let i = 0; i <= N - 8; i++) {
  for (let j = 0; j <= M - 8; j++) {
    minRepaints = Math.min(minRepaints, countRepaints(i, j));
  }
}
console.log(minRepaints);