function solution(balls, share) {
    let result = 1;
    
    if(balls === share) return result;
    if(share > balls - share) share = balls - share;
    
    for(let i=0; i<share; i++) {
        result *= (balls - i);
        result /= (i+1);
    }
    return result;
}