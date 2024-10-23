function solution(numbers) {
    let arr = [];
    numbers.forEach((n, idx) => {
        numbers.slice(idx+1).forEach((next) => {
            arr.push(n + next);
        })
    })
    
    let result = new Set(arr.sort((a, b) => a-b));
    
    return Array.from(result);
}