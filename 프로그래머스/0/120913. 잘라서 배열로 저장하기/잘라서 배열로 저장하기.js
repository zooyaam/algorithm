function solution(my_str, n) {
    let result = [];
    
    for(let i=0; i < my_str.length / n; i++){
        result.push(my_str.substring(n*i, n*(i+1)));
    }
    return result;
}