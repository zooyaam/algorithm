function solution(array) {
    let map = new Map();
    for(let num of array) {
        map.set(num, (map.get(num) || 0) + 1);
    }
    
    let m = Math.max(...map.values())
    let modes = [...map.entries()]
        .filter(([num, count]) => count === m)
        .map(([num]) => num);
    
    return modes.length > 1 ? -1 : modes[0];
    
}