process.stdin.setEncoding('utf8');
process.stdin.on('data', data => {
    const n = data.split(" ");
    const a = Number(n[0]), b = Number(n[1]);
    
    let star = "*";
    let row = star.repeat(a);
    let col = "\n" + row;
    let rectangle = row + col.repeat(b-1);
    
    console.log(rectangle)
});