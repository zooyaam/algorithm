const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let input = [];

rl.on('line', function (line) {
    input = line.split(' ');
}).on('close', function () {
    solution(input);
});

function solution(input) {
    const sum = Number(input[0]) + Number(input[1]);
    console.log(`${input[0]} + ${input[1]} = ${sum}`);
}