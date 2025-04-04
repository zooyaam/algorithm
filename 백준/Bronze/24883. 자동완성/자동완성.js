const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim();

input.toUpperCase() === 'N' ? console.log('Naver D2') : console.log('Naver Whale');