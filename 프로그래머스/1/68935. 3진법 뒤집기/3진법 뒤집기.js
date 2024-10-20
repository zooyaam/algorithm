function solution(n) {
    let arr = []
    
    while(n !== 0){
        arr.push(n % 3);
        n = Math.floor(n / 3)
    }
    
    let l = arr.length - 1
    let sum = 0;
    
    for(let i=0; i<arr.length; i++){
        sum += Math.pow(3, l) * arr[i];
        l--;
    }
    return sum
}