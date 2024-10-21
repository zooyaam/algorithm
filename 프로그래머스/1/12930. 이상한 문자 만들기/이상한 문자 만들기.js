function solution(s) {
    let arr = s.split(' ');
    
    arr = arr.map((item) => item.split(''));
    arr = arr.map((item) => 
        item.map((t, idx) => 
            idx % 2 === 1 ? t.toLowerCase() : t.toUpperCase()
        )
        .join('')
    );
    
    return arr.join(' ');
}
