function solution(number) {
    let result = 0;
    let n1, n2, n3;
    
    
    for(let i=0; i<number.length - 2; i++){
        n1 = number[i];
        
        for(let j=i+1; j<number.length - 1; j++){
            n2 = number[j];
            
            for(let k=j+1; k<number.length; k++){
                n3 = number[k];
                
                if(n1 + n2 + n3 === 0) result++;
            }
        }
    }
    return result;
}