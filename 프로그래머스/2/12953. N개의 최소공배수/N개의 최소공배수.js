function solution(arr) {
    function gcd(a, b) {
        while (b !== 0) {
            let r = b;
            b = a % b;
            a = r;
        }
        
        return a;
    }
    
    let lcm = arr[0];
    
    for (let i = 1; i < arr.length; i++) {
        lcm = (lcm * arr[i]) / gcd(lcm, arr[i]);
    }
    
    return lcm;
}