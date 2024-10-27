function solution(n, arr1, arr2) {
    let temp = [];
    
    const toBinary = (arr) => {
        return arr.map((num) => num.toString(2).padStart(n, '0'));
    }
    arr1 = toBinary(arr1);
    arr2 = toBinary(arr2);
    
    for(let i=0; i<n; i++){
        temp.push((arr1[i]*1 + arr2[i]*1).toString().padStart(n, '0'));
    }
    
    return temp.map(num =>
        num.split('').map(digit => (digit === '0' ? ' ' : '#')).join('')
    );
    
}