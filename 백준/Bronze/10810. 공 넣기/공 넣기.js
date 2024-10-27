const fs = require('fs');
let input = fs.readFileSync("/dev/stdin").toString().trim();

let lines = input.split('\n');
let [N, M] = lines[0].split(' ').map(Number);

function solution(){
    let baskets = Array(N).fill(0);
    
    for(let i=1; i<=M; i++){
        let [start, end, ball] = lines[i].split(' ').map(Number);
        
        for(let j=start-1; j<end; j++){
            baskets[j] = ball;
        }
    }
    
    console.log(baskets.join(' '))
}

solution();