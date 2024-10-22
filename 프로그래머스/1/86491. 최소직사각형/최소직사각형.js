function solution(sizes) {
    sizes.map((arr) => arr.sort((a, b) => b-a));
    let max_w = Math.max(...sizes.map((arr) => arr[0]));
    let max_h = Math.max(...sizes.map((arr) => arr[1]))
    
    return max_w * max_h;
}