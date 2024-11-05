const fs = require('fs');
let input = fs.readFileSync('/dev/stdin').toString().trim();

function solution(str){
    const croatia = {
        "c=": "č",
        "c-": "ć",
        "dz=": "dž",
        "d-": "đ",
        "lj": "lj",
        "nj": "nj",
        "s=": "š",
        "z=": "ž"
    };

    
    for(const key in croatia) {
        str = str.split(key).join("A")
    }
    console.log(str.length);
}

solution(input);