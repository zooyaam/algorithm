function solution(num_list) {
    return num_list.reduce((acc, cur) => {
        let count = 0;
        
        while (cur !== 1) {
            if (cur % 2 === 1) {
                cur = (cur - 1) / 2;
            } else {
                cur /= 2;
            }
            count++;
        }
        return acc + count;
    }, 0);
}
