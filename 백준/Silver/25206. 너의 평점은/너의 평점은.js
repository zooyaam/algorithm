const fs = require('fs');
let input = fs.readFileSync('/dev/stdin').toString().trim();

let lines = input.split('\n');
let scales = lines.map((item) => parseFloat(item.split(' ')[1]));
let scores = lines.map((item) => item.split(' ')[2]);

function solution(scales, scores) {
    let sum = 0;
    const grades = {
        "A+": 4.5,
        "A0": 4.0,
        "B+": 3.5,
        "B0": 3.0,
        "C+": 2.5,
        "C0": 2.0,
        "D+": 1.5,
        "D0": 1.0,
        "F": 0.0,
        "P": 0.0,
    };
    
    let totalScales = 0;
    let totalWeightedScore = 0;
    
    for (let i = 0; i < scales.length; i++) {
        if (scores[i] !== "P") {
            totalScales += scales[i];
            totalWeightedScore += scales[i] * grades[scores[i]];
        }
    }
    
    let average = totalWeightedScore / totalScales;
    console.log(average);
}

solution(scales, scores);
