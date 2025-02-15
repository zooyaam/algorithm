function solution(polynomial) {
    let terms = polynomial.split(' + ');
    let coefficient = 0;
    let constant = 0;
    
    for (let term of terms) {
        if (term.includes('x')) {
            let num = term.replace('x', '') || '1';
            coefficient += Number(num);
        } else {
            constant += Number(term);
        }
    }
    
    let result = [];
    if (coefficient) result.push(coefficient === 1 ? 'x' : `${coefficient}x`);
    if (constant) result.push(constant);
    
    return result.join(' + ');
}
