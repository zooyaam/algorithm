function solution(n, m) {
    
    const gcm = (a, b) => {
        while (b !== 0) {
            let temp = b;
            b = a % b;
            a = temp;
        }
        return a
    }
    
    const lcd = (gcm, a, b) => {
        return a * b / gcm
    }
    
    return [gcm(n, m), lcd(gcm(n, m), n, m)]
}