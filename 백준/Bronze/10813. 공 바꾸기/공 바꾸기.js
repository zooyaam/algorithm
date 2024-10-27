const fs = require('fs');
let input = fs.readFileSync("/dev/stdin").toString().trim();

let lines = input.split('\n');
let [N, M] = lines[0].split(' ').map(Number);
let baskets = Array.from({ length: N }, (_, i) => i + 1);

function solution(){
    for(let i=1; i<=M; i++){
        let [b1, b2] = lines[i].split(' ').map(Number);
        let temp = baskets[b1 - 1];
        
        baskets[b1 - 1] = baskets[b2 - 1];
        baskets[b2 - 1] = temp;
    }
    console.log(baskets.join(' '))
}

solution();