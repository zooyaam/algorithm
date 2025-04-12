const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

let coldestCity = '';
let coldestTemp = Infinity; 

for (let i = 0; i < input.length; i++) {
    const [city, tempString] = input[i].split(' ');
    const temp = parseInt(tempString, 10);
    
    if (temp < coldestTemp) {
        coldestTemp = temp;
        coldestCity = city;
    }
    
    if (city === 'Waterloo') {
        return console.log(coldestCity);
    }
}