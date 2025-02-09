const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

function swapCase(str) {
    return str.split('')
        .map((char) => 
            char === char.toLowerCase()
                ? char.toUpperCase()
                : char.toLowerCase()
        )
        .join('');
}

rl.on('line', function (line) {
    console.log(swapCase(line));
    rl.close();
}).on('close', function () {
    process.exit();
});
