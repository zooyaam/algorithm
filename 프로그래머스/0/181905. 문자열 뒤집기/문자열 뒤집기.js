function solution(my_string, s, e) {
    if(s === e) return my_string;
    
    const str = my_string.substring(s, e+1).split('').reverse().join('');
    return my_string.replace(my_string.substring(s, e+1), str);
}