function solution(my_string, overwrite_string, s) {
    const str1 = my_string.substring(0, s);
    const str2 = my_string.substring(s + overwrite_string.length);
    
    return str1 + overwrite_string + str2;
}