const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim();

const line = input.split('\n');
const [N, M] = line[0].split(' ').map(Number);
const nums = line[1].split(' ').map(Number);

function solution() {
    let max = 0;
    for (let i = 0; i < N-2; i++) {
        for (let j = i+1; j < N-1; j++) {
            for (let k = j+1; k < N; k++) {
                let sum = nums[i] + nums[j] + nums[k];
                if(sum <= M && sum > max) {
                    max = sum;
                }
            }
        }
    }
    console.log(max);
}

solution();