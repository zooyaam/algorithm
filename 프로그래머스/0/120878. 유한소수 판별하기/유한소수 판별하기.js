function solution(a, b) { 
    let B = b;
    
    while (b !== 0) {
        let r = b;
        b = a % b;
        a = r;
    }
    B /= a;

    while (!(B % 2)) B /= 2;
    while (!(B % 5)) B /= 5;
    
    return B === 1 ? B : 2;
}