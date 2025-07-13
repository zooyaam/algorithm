function solution(a, b, c, d) {
    const arr = [a, b, c, d];
    const map = new Map();

    // 각 숫자의 등장 횟수 저장
    arr.forEach((n) => {
        map.set(n, (map.get(n) || 0) + 1);
    });

    const key = [...map.keys()];
    const val = [...map.values()];
    let score = 0;

    if (map.size === 1) score = 1111 * key[0];
    if (map.size === 4) score = Math.min(...arr);
    
    if (map.size === 2) {
        if (val[0] === val[1]) {
            score = (key[0] + key[1]) * Math.abs(key[0] - key[1]);
        } else {
            const p = val[0] === 3 ? key[0] : key[1];
            const q = val[0] === 1 ? key[0] : key[1];
            score = Math.pow(10 * p + q, 2);
        }
    }
    
    if (map.size === 3) {
        let pair, others = [];
        for (let [k, v] of map.entries()) {
            if (v === 2) pair = k;
            else others.push(k);
        }
        score = others[0] * others[1];
    }

    return score;
}
