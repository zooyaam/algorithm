const fs = require('fs');
const N = Number(fs.readFileSync('/dev/stdin'));

function solution() {
    let count = 0;
    let num = 666;
    
    while (true) {
        if(num.toString().includes('666')) {
            count += 1;
            if(count === N) {
                console.log(num);
                break;
            }
        }
        num += 1;
    }
}

solution();