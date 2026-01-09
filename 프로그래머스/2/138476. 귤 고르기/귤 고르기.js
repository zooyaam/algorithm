function solution(k, tangerine) {
    const map = new Map();
    
    for(let tang of tangerine) {
        if (map.get(tang)) {
            map.set(tang, map.get(tang) + 1);
        } else {
            map.set(tang, 1);
        }
    }
    
    const arr = Array.from(map.values());
    arr.sort((a, b) => b - a);
    
    let n = k;
    let i = 0;
    
    while (n > 0) {
        n -= arr[i];
        i++;
    }
    
    return i;
}