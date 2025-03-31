const fs = require("fs");
const input = fs.readFileSync("/dev/stdin").toString().trim().split("\n");

const N = Number(input[0]);
const stack = [];
let result = [];

for (let i = 1; i <= N; i++) {
  const command = input[i].split(" ");

  switch (command[0]) {
    case "1":
      stack.push(parseInt(command[1]));
      break;
    case "2":
      result.push(stack.length > 0 ? stack.pop() : -1);
      break;
    case "3":
      result.push(stack.length);
      break;
    case "4":
      result.push(stack.length === 0 ? 1 : 0);
      break;
    case "5":
      result.push(stack.length > 0 ? stack[stack.length - 1] : -1);
      break;
  }
}

console.log(result.join("\n"));
