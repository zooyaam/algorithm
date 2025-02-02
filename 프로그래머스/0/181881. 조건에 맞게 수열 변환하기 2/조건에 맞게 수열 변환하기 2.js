function solution(arr, count = 0, prevArr = []) {
    if (JSON.stringify(arr) === JSON.stringify(prevArr)) {
        return count-1;
    }

    let newArr = arr.map(num => 
        num >= 50 && num % 2 === 0 ? num / 2 : 
        num < 50 && num % 2 === 1 ? num * 2 + 1 : num
    );

    return solution(newArr, count + 1, arr);
}
