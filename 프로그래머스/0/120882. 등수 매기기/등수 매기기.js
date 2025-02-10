function solution(score) {
    const arr = score.map(([e, m], index) => ({
        index,
        sum: e + m
    }));
    arr.sort((a, b) => b.sum - a.sum);

    const map = new Map();
    
    let rank = 1;
    arr.forEach((num, idx) => {
        if (!map.has(num.sum)) {
            map.set(num.sum, rank);
        }
        rank++;
    });
    
    return score.map(([e, m]) => map.get(e + m));
}
