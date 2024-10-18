function solution(left, right) {
    let even = 0;
    let odd = 0;
    
    for(left; left <= right; left++){
        Math.sqrt(left) % 1 ? even += left : odd += left;
    }
    return even - odd;
    
}