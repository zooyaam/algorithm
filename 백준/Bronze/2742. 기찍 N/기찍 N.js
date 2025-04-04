const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim();

let num = Number(input);

while (num >= 1) {
    console.log(num);
    num--;
}