function solution(n, arr1, arr2) {
    let map1 = arr1.map((num) => num.toString(2).padStart(n, '0'));
    let map2 = arr2.map((num) => num.toString(2).padStart(n, '0'));
    
    const map = Array.from({ length: n }, () => Array(n).fill(0));
    
    for (let i = 0; i < n; i++) {
        for (let j = 0; j < n; j++) {
            if (map1[i][j] === '0' && map2[i][j] === '0') {
                map[i][j] = ' '
            } else {
                map[i][j] = '#';
            }
        }
    }
    
    return map.map((row) => row.join(''));
}