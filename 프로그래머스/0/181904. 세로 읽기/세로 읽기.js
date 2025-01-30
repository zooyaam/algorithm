function solution(my_string, m, c) {
    let result = '';
    
    if(m === 1) return my_string;
    
    for(let i = 0; i < my_string.length / m; i++) {
        result += my_string[m * i + c - 1];
    }
    return result;
}