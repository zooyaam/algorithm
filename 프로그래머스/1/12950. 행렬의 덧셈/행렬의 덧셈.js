function solution(arr1, arr2) {
    let n = arr1.length;
    let m = arr1[0].length;
    
    let result = [];
    
    for(let i = 0; i < n; i++){
        let row = [];
        for(let j = 0; j < m; j++){
            row.push(arr1[i][j] + arr2[i][j]);
        }
        result.push(row);
    }
    
    return result;
}
