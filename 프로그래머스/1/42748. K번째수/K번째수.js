function solution(array, commands) {
    let result = [];
    
    return commands.map((comm) => {
        let temp = array.slice(comm[0] - 1, comm[1]).sort((a, b) => a-b);
        return temp[comm[2] - 1];
    })
}