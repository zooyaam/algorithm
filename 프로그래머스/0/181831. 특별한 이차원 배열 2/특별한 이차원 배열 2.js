function solution(arr) {
    for(let i = 0; i < arr.length; i++){
        for(let j = i + 1; j < arr.length; j++) {
            if(arr[i][j] !== arr[j][i]) {
                return 0;
            }
        }
    }
    return 1;
}