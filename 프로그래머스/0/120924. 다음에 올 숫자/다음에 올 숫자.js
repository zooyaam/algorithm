function solution(common) {
    let last = common[common.length-1];
    
    if(common[1]*2 === common[2] + common[0]) {
        return last + common[1] - common[0]
    } else {
        return last * (common[1] / common[0])
    }
}