const fs = require('fs');
let input = fs.readFileSync('/dev/stdin').toString().trim();

let rows = input.split('\n');
let matrix = rows.map(row => row.split(' ').map(Number));

function solution(arr) {
    let maxValue = -Infinity;
    let row = 0;
    let col = 0;
    
    for(let i = 0; i < arr.length; i++) {
        for(let j = 0; j < arr[i].length; j++) {
            if (arr[i][j] > maxValue) {
                maxValue = arr[i][j];
                row = i;
                col = j;
            }
        }
    }
    console.log(maxValue);
    console.log(row + 1, col + 1);
}

solution(matrix);