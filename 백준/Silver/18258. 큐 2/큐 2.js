const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

class Node {
  constructor(value) {
    this.value = value;
    this.next = null;
  }
}

class Queue {
  constructor() {
    this.front = null;
    this.rear = null;
    this.length = 0;
  }

  push(value) {
    const newNode = new Node(value);
    if (!this.front) {
      this.front = this.rear = newNode;
    } else {
      this.rear.next = newNode;
      this.rear = newNode;
    }
    this.length++;
  }

  pop() {
    if (!this.front) return -1;
    const value = this.front.value;
    this.front = this.front.next;
    if (!this.front) this.rear = null;
    this.length--;
    return value;
  }

  size() {
    return this.length;
  }

  empty() {
    return this.length === 0 ? 1 : 0;
  }

  frontValue() {
    return this.front ? this.front.value : -1;
  }

  backValue() {
    return this.rear ? this.rear.value : -1;
  }
}

const queue = new Queue();
let result = '';

for (let i = 1; i <= Number(input[0]); i++) {
  const [command, num] = input[i].split(' ');

  switch (command) {
    case 'push':
      queue.push(Number(num));
      break;
    case 'pop':
      result += queue.pop() + '\n';
      break;
    case 'size':
      result += queue.size() + '\n';
      break;
    case 'empty':
      result += queue.empty() + '\n';
      break;
    case 'front':
      result += queue.frontValue() + '\n';
      break;
    case 'back':
      result += queue.backValue() + '\n';
      break;
  }
}
    
console.log(result.trim());