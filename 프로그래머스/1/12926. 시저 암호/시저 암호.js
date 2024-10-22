function solution(s, n) {
    let arr = Array.from(s);
    
    for(let i = 0; i < arr.length; i++) {
        let num = arr[i].charCodeAt();
        
        if (num >= 65 && num <= 90) {
            num = num + n > 90 ? num + n - 26 : num + n;
        } else if (num >= 97 && num <= 122) {
            num = num + n > 122 ? num + n - 26 : num + n;
        }
        
        arr[i] = String.fromCharCode(num);
    }
    
    return arr.join('');
}
