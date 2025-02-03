function solution(my_string, queries) {
    const arr = my_string.split('');
    
    queries.forEach(([s, e]) => {
        const r = arr.slice(s, e+1).reverse();
        arr.splice(s, e-s+1, ...r);
    })
    
    return arr.join('');
}