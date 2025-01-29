function solution(todo_list, finished) {
    const result = [];
    finished.forEach((item, idx) => {
        if (!item) {
            result.push(todo_list[idx]);
        }
    });
    
    return result;
}
