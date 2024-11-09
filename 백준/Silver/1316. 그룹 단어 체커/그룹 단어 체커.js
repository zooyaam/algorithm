const fs = require('fs');
let input = fs.readFileSync('/dev/stdin').toString().trim();

let lines = input.split('\n');
let N = Number(lines[0]);
let words = lines.slice(1, N+1);

function solution(words) {
    let count = 0;
    
    const isGroupWord = (word) => {
        const seen = new Set();
        let prevChar = '';
        
        for(let i = 0; i < word.length; i++){
            let currChar = word[i];
            if (currChar !== prevChar) {
                if (seen.has(currChar)) {
                    return false;
                }
                seen.add(currChar);
            }
            prevChar = currChar;
        }
        return true;
    };
    
    words.forEach((word) => {
        if (isGroupWord(word)) count += 1;
    });
    
    console.log(count);
}

solution(words);
