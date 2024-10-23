function solution(s) {
    const numList = [
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
    
    numList.forEach((str, index) => s.includes(str) && (s = s.replaceAll(str, index)));

    return Number(s);
}
