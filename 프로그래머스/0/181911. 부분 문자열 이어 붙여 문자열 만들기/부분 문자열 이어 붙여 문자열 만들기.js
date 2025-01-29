function solution(my_strings, parts) {
    const result = my_strings.map((word, idx) => 
        word.substring(parts[idx][0], parts[idx][1] + 1)
    );
    
    return result.join('');
}
