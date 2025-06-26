function solution(s) {
    const num_words = [
        'zero', 
        'one', 
        'two', 
        'three', 
        'four', 
        'five', 
        'six', 
        'seven', 
        'eight', 
        'nine'
    ];
    
    num_words.forEach((word, idx) => s.includes(word) && (s = s.replaceAll(word, idx)));
    
    return Number(s);
}