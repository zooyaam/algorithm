function solution(arr, queries) {
    return queries.map(([s, e, k]) => {
        let list = [];
        for (let i = s; i <= e; i++) {
            if (arr[i] > k) {
                list.push(arr[i]);
            }
        }
        return list.length > 0 ? Math.min(...list) : -1;
    });
}
