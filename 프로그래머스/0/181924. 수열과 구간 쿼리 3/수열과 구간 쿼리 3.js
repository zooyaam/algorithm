function solution(arr, queries) {
    queries.forEach(query => {
        let temp = arr[query[0]];
        
        arr[query[0]] = arr[query[1]];
        arr[query[1]] = temp;
    });
    return arr;
}
