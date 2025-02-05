function solution(arr) {
    const col = arr.length;
    const row = arr[0].length;
    
    if(col === row) return arr;
    if(col > row) {
        return arr.map((l) => [...l, ...Array(col-row).fill(0)]);
    } else {
        const newArr = Array(row-col).fill().map(() => Array(row).fill(0))
        return [...arr, ...newArr];
    }
}