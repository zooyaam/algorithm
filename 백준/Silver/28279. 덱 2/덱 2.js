const fs = require("fs");
const input = fs.readFileSync("/dev/stdin").toString().trim().split("\n");

class Deque {
  constructor() {
    this.data = {};
    this.front = 0;
    this.back = 0;
  }

  pushFront(x) {
    this.front--;
    this.data[this.front] = x;
  }

  pushBack(x) {
    this.data[this.back] = x;
    this.back++;
  }

  popFront() {
    if (this.isEmpty()) return -1;
    const val = this.data[this.front];
    delete this.data[this.front++];
    return val;
  }

  popBack() {
    if (this.isEmpty()) return -1;
    this.back--;
    const val = this.data[this.back];
    delete this.data[this.back];
    return val;
  }

  size() {
    return this.back - this.front;
  }

  isEmpty() {
    return this.size() === 0 ? 1 : 0;
  }

  peekFront() {
    return this.isEmpty() ? -1 : this.data[this.front];
  }

  peekBack() {
    return this.isEmpty() ? -1 : this.data[this.back - 1];
  }
}

const deque = new Deque();
const n = Number(input[0]);
const result = [];

for (let i = 1; i <= n; i++) {
  const [cmd, val] = input[i].split(" ").map(Number);

  switch (cmd) {
    case 1:
      deque.pushFront(val);
      break;
    case 2:
      deque.pushBack(val);
      break;
    case 3:
      result.push(deque.popFront());
      break;
    case 4:
      result.push(deque.popBack());
      break;
    case 5:
      result.push(deque.size());
      break;
    case 6:
      result.push(deque.isEmpty());
      break;
    case 7:
      result.push(deque.peekFront());
      break;
    case 8:
      result.push(deque.peekBack());
      break;
  }
}

console.log(result.join("\n"));