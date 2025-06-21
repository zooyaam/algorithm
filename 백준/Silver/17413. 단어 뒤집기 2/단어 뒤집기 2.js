const readline = require('readline');
const rl = readline.createInterface({ input: process.stdin });

rl.on('line', (line) => {
    const S = line.split('');
    console.log(solution(S));
});

function solution(s) {
    let result = '';
    let word = '';
    let isTag = false;
    
    for (let i = 0; i < s.length; i++) {
        const char = s[i];
        
        if (char === '<') {
            // 태그가 열렸을 때
            result += word.split('').reverse().join('');
            isTag = true;
            word = '';
            result += char;
        } else if (char === '>') {
            // 태그가 닫혔을 때
            isTag = false;
            result += char;
        } else if (isTag) {
            // 태그 안일 때: 그대로 출력
            result += char;
        } else if (char === ' ') {
            // 단어 사이의 공백일 때
            result += word.split('').reverse().join('') + ' ';
            word = '';
        } else {
            // 단어일 때
            word += char;
        }
    }
    result += word.split('').reverse().join('');
    return result;
}
