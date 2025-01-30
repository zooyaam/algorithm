function solution(my_string, indices) {
    const result = my_string.split('');
    
    indices.sort((a, b) => b - a);
    
    indices.forEach((idx) => {
        result.splice(idx, 1);
    });
    return result.join('');
}