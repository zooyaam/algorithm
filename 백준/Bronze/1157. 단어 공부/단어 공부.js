const fs = require('fs');
let input = fs.readFileSync("/dev/stdin").toString().trim();

let characters = input.split('');

function solution(array){
    const count = array
        .map(char => char.toUpperCase())
        .reduce((acc, char) => {
            acc[char] = (acc[char] || 0) + 1;
            return acc;
        }, {});
    
    let maxKey = '';
    let maxValue = 0;
    let isDuplicate = false;
    
    Object.entries(count).forEach(([key, value]) => {
        if (value > maxValue) {
            isDuplicate = false;
            maxValue = value;
            maxKey = key;
        } else if (value === maxValue) {
            isDuplicate = true;
        }
    });
    console.log(isDuplicate ? '?' : maxKey);
}

solution(characters);