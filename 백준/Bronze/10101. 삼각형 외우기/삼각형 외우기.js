const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim();

const angles = input.split('\n').map(Number);

function solution() {
    if(angles.reduce((acc, cur) => acc + cur, 0) !== 180) return console.log('Error')
    
    if(angles.every(angle => angle === 60)) {
        console.log("Equilateral");
    } else if(angles[0] !== angles[1] && angles[1] !== angles[2] && angles[0] !== angles[2]) {
        console.log("Scalene");
    } else {
        console.log("Isosceles");
    }
}

solution();