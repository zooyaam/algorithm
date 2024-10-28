const fs = require('fs');
let input = fs.readFileSync("/dev/stdin").toString().trim();

let lines = input.split('\n');
let [n, m] = lines[0].split(' ').map(Number);
let baskets = Array.from({ length: n }, (_, i) => i + 1);

function solution(){
    for(let i = 1; i <= m; i++){
        let [start, end] = lines[i].split(' ').map(Number);
        start -= 1;
        end -= 1;
        
        while (start < end) {
            [baskets[start], baskets[end]] = [baskets[end], baskets[start]];
            start++;
            end--;
        }
    }
    console.log(baskets.join(' '));
}

solution();
