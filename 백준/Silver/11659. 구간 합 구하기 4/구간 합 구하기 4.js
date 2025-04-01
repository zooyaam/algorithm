const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const [N, M] = input[0].split(' ').map(Number);
const nums = input[1].split(' ').map(Number);
const prefixSum = Array(N + 1).fill(0);

for (let i = 1; i <= N; i++) {
    prefixSum[i] = prefixSum[i - 1] + nums[i - 1];
}

for (let i = 0; i < M; i++) {
    let [s, e] = input[i + 2].split(' ').map(Number);
    console.log(prefixSum[e] - prefixSum[s - 1]);
}
