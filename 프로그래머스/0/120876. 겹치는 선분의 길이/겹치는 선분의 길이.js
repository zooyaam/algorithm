function solution(lines) {
    const map = new Map();
    for (const [s, e] of lines) {
        let i = s + 0.5;
        while (i < e) {
            map.set(i, (map.get(i) || 0) + 1);
            i += 1;
        }
    }
    
    let count = 0;
    map.forEach((value) => {
        if (value >= 2) count++;
    });

    return count;
}
