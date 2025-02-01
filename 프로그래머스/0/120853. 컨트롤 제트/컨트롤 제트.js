function solution(s) {
    const arr = s.split(' ')
    
    while (arr.includes('Z')) {
        let z = arr.indexOf('Z');
        
        if(z !== -1) {
            arr.splice(z-1, 2);            
        }
    }
    
    return arr.reduce((acc, cur) => Number(acc) + Number(cur), 0);
}