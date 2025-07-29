function solution(s) {
    const arr = s.split(' ');
    const value = [];
    
    for (const word of arr) {
        if (word.length === 0) {
            value.push("");
            continue;
        }

        let firstChar = word[0];
        let restOfWord = word.slice(1).toLowerCase();
        
        if (!Number(firstChar)) {
            firstChar = firstChar.toUpperCase();  
        }
        
        value.push(firstChar + restOfWord);
    }
    
    return value.join(' ');
}