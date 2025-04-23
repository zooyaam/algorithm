const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

function recursion(s, l, r, counter) {
    counter.count++;
    if (l >= r) return 1;
    if (s[l] !== s[r]) return 0;
    return recursion(s, l + 1, r - 1, counter);
}

function isPalindrome(s) {
    const counter = { count : 0 };
    const result = recursion(s, 0, s.length - 1, counter);
    return [result, counter.count];
}

const T = Number(input[0]);
for (let i = 1; i <= T; i++) {
    const S = input[i];
    const [result, count] = isPalindrome(S);
    console.log(`${result} ${count}`);
}