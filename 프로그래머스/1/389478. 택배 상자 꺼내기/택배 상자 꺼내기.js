function solution(n, w, num) {
    const h = Math.ceil(n / w);
    const arr = Array.from({ length: h }, () => Array(w).fill(0));
    
    let number = 1;
    let pos = [];
    for (let i = 0; i < h; i++) {
        if (i % 2 === 0) {
            // 왼쪽부터 쌓음
            for (let j = 0; j < w; j++) {
                if (number > n) break;
                arr[i][j] = number;
                
                if(number === num) pos = [i, j];
                number++;
            }
        } else {
            // 오른쪽부터 쌓음
            for (let k = w - 1; k >= 0; k--) {
                if (number > n) break;
                arr[i][k] = number;
                
                if(number === num) pos = [i, k];
                number++;
            }
        }
    }
    
    let count = 0;
    arr.forEach((line) => {
        if (line[pos[1]] > 0) return count++;
    })
    
    return count - pos[0];
}