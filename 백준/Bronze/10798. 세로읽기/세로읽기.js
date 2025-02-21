const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim();

const words = input.split('\n');

function solution(words) {
    let l = Math.max(...words.map(word => word.length));
    let result = '';

    for (let i = 0; i < l; i++) { 
        for (let j = 0; j < words.length; j++) { 
            if (words[j][i] !== undefined) {
                result += words[j][i];
            }
        }
    }

    console.log(result);
}

solution(words);
